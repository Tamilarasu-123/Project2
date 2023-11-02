pipeline{
agent any
tools{
maven 'MAVEN_HOME'
}
stages{
stage('Welcome Stage'){
steps{
echo 'welcome to jenkins pipeline'
}
}
stage('maven clean'){
steps{
bat 'mvn clean'
}
}
stage('Maven Package'){
steps{
bat 'mvn package'
}
}
stage('Maven Install'){
steps{
bat 'mvn install'
}
}
stage('Final Build Steps'){
steps{
echo 'Build Done'
}
}

}
}
