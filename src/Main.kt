fun main(){
    var text ="AkiraChix"
   println(text[0].toString()+text[2]+text[3])
    parameters()
    interest()
    name("judie")



}
fun parameters(){
    var name ="Rehema"
    var age =43
    var sentence =("hi,my name is $name and Iam $age years old")
    println(sentence)
}

fun interest(){
    var name ="Nakuru"
    println(name.length)
}
fun name(name:String) {
    if (name.equals("rehema")) {
        println("Thats me")
    } else
        println("I dont know how that is")
}
