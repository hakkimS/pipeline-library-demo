#!/usr/bin/env groovy
package com.cleverbuilder
class SampleClass {
   def numberSequence(){
     def temp = libraryResource 'org/sample.sh'
     writeFile file:"test.sh",text:temp
     sh 'chmod +x test.sh'
   
}

   }
