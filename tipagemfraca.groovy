//Tipagem Forte vs Tipagem Fraca

def a = "Sou tipagem fraca"
def b = "Nao e necessario declarar o tipo das variavies"

println a
println b

def var = "Meu nome é Groovy"
println "Var sou String: "+var
var = 123
println "Var agora Inteiro: "+var

def soma(x,y){
    return (x+y)
}
println "Meu  metodos não precisa de tipo de retorno nem do tipo dos parametros :)"
println "Metodo Soma >> " +soma(5,5);

