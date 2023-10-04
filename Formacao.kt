data class Formacao(
    val nome: String,
    val vararg: List<ConteudoEducacional>
) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (this.inscritos.contains(usuario)) {
            throw Exception("Erro: ${usuario.nome} já está inscrito na formação.")
        }

        this.inscritos.add(usuario)
    }
}
