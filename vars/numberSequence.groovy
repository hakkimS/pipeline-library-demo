def call(){
     def temp = libraryResource 'org/sample.sh'
     writeFile file:"test.sh",text:temp
     sh 'chmod +x test.sh'
     def seqno = sh './test.sh'
}
