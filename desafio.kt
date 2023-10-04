fun main() {
    val usuario1 = Usuario("Thalita", "Thalita@email.com", Nivel.BASICO)
    val usuario2 = Usuario("Ana Maria", "anamaria@email.com", Nivel.INTERMEDIARIO)
    val usuario3 = Usuario("Tiago", "tiago@email.com", Nivel.AVANCADO)

    val conteudo1 = ConteudoEducacional("Java", 30, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Kotlin", 45, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("PHP", 60, Nivel.AVANCADO)

    val formacao = Formacao("Formação BackEnd", listOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1) // OK
    try {
        formacao.matricular(usuario2)
        formacao.matricular(usuario1) // Se Erro: usuário já inscrito
    } catch (e: Exception) {
        println(e.message)
    }
    formacao.matricular(usuario3) // OK

    println("Usuários inscritos para a ${formacao.nome}:")
    for (usuario in formacao.inscritos) {
        println(usuario.nome)
    }
}
