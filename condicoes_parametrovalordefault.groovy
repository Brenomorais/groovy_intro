//Verifica��o de condi��es

boolean encontrou = true

if(encontrou){
    println "entrou no if"
}else{
    println "passou no else"
}

//switchcase
//o case sera executado caso o valor da variavel esteja entre 0 e 10

def a = 15
switch(a){
    case 0..10:
        println ">>Entre 0 e 10"
        break
    default:
        println ">>Default n�o esta entre os valores especificados"
}

//valires default para parametro de metodos

//valores defaut
def soma(x, y = 2){
    println x + y
}
soma 1 //parametro y sera o valor 2 utilizado como default
soma 2, 4 //n�o utiliza o parametro default
