//Manipulando String
//Concatena��o de string feita operador : + ou $


String nome = "Groovy"
println nome

//operador + fora da variavel
nome += " Grails"

println nome

String sufixo = "Groovy"
//operador $ dnetro da variavel
def fraseCompleta = "Programando em $sufixo"

println fraseCompleta

if(nome == "Groovy Rails"){
    println "As string s�o iguais!"
}else{
    println "As string n�o iguais!"
}

