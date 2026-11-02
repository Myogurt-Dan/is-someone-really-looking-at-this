fun main()
 val senhaCorreta = "admin123"
 var senha = ""

 var tentativas = 0

 while (true) {
    senha = readln()
    tentativas++

    if (senha == senhaCorreta) {
        println("Acesso Confirmado")
        break
    }

    println("Senha Incorreta")

    if (tentativas > 3) {
        println("Muitas tentativas, por favor tente novamente mais tarde")
        break
    }
 }
}
