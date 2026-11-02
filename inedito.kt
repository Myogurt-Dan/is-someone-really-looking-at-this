fun main() {
busca@ for (andar in 1..5) {
    for (sala in 1..4) {
        println("Verificando Andar $andar, Sala $sala")

        if (andar == 3 && sala == 2) {
            println("Alvo Localizado")
            break@busca
        }
    }
 }
}


