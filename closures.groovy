//Cloures e semelhante a Lambda do java 8
//variavel que armazena codigo executavel 

//declarando um closure
//um clousure e declarada e inicialiad como uma variavel
//porem ao inves de recever um dado, rece um codigo no caso abaixo
//recebe o comando println

def olaMundo = {
    println "Olá Mundo!"
}

//executando o closure
olaMundo()

//clouse com paraametros
def soma = { a, b ->
    a + b
}
println "Clouse soma: "+soma(3,3)