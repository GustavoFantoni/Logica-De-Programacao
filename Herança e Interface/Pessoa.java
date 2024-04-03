    abstract class Pessoa {
        protected String nome;
        protected String endereco;
        protected int idade;
        protected String sexo;
        public Pessoa(String nome, String endereco, int idade, String sexo) {
            this.nome = nome;
            this.endereco = endereco;
            this.idade = idade;
            this.sexo = sexo;
        }
        public String getNome() {
            return nome;
        }
        public String getEndereco() {
            return endereco;
        }
        public int getIdade() {
            return idade;
        }
        public String getSexo() {
            return sexo;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        public void saudacao() {
            System.out.println("Ola, meu nome é " + nome);
        }
    }
