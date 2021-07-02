#!/usr/bin/env groovy
package com.cleverbuilder
@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

class SampleClass {
   def numberSequence(){
     def temp = libraryResource 'org/sample.sh'
     writeFile file:"test.sh",text:temp
     sh 'chmod +x test.sh'
     def int count = 1
  if (!Primes.isPrime(count)) {
    error "${count} was not prime"
  } else {
    echo "${count} is a prime"
  }
}

   }
