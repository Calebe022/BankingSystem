# 🏦 BankingSystem

> Sistema Bancário simples desenvolvido em Java como parte do processo de aprendizado e prática de programação orientada a objetos.

---

## 📋 Sobre o Projeto

O **BankingSystem** é uma aplicação de console desenvolvida em Java que simula as operações básicas de um sistema bancário. O projeto foi criado com foco no aprendizado dos pilares da **Programação Orientada a Objetos (POO)** — encapsulamento, herança, polimorfismo e abstração — aplicados em um contexto prático e realista.

A aplicação permite ao usuário interagir com contas bancárias por meio de um menu no terminal, realizando operações como depósito, saque e consulta de saldo.

---

## ✨ Funcionalidades

- ✅ Criação de conta bancária
- ✅ Depósito de valores
- ✅ Saque com validação de saldo
- ✅ Consulta de saldo
- ✅ Visualização de dados da conta
- ✅ Interação via menu no terminal (console)

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 8+ |
| IntelliJ IDEA | IDE utilizada no desenvolvimento |

---

## 📁 Estrutura do Projeto

```
BankingSystem/
├── .idea/                  # Configurações do IntelliJ IDEA
├── src/                    # Código-fonte principal
│   └── ...                 # Classes Java do sistema
├── .gitignore              # Arquivos ignorados pelo Git
└── sistema-bancario.iml    # Arquivo de módulo do IntelliJ IDEA
```

### Descrição das pastas

- **`.idea/`** — Pasta gerada automaticamente pelo IntelliJ IDEA com configurações do projeto (run configurations, code style, etc.). Não faz parte da lógica da aplicação.
- **`src/`** — Diretório principal do código-fonte. Contém todas as classes Java responsáveis pela lógica do sistema bancário, incluindo as entidades (como `Conta`), os serviços e o ponto de entrada da aplicação (`Main`).
- **`sistema-bancario.iml`** — Arquivo de configuração do módulo IntelliJ IDEA. Define o SDK utilizado e o caminho das fontes.

---

## 🧠 Conceitos de POO Aplicados

Este projeto foi desenvolvido com o objetivo de praticar os principais conceitos de Orientação a Objetos em Java:

- **Encapsulamento** — Atributos das classes são privados e acessados por meio de getters e setters.
- **Herança** — Tipos diferentes de conta podem estender uma classe base comum.
- **Abstração** — Modelagem de entidades do mundo real (conta bancária, cliente) em classes Java.
- **Polimorfismo** — Comportamentos específicos por tipo de conta, reutilizando a mesma interface.

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html) instalado
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado) ou qualquer IDE/editor Java de sua preferência

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Calebe022/BankingSystem.git
   ```

2. **Abra o projeto no IntelliJ IDEA:**
   - Vá em `File > Open` e selecione a pasta do projeto clonado.

3. **Execute a classe principal:**
   - Localize a classe `Main` dentro de `src/`
   - Clique com o botão direito e selecione `Run 'Main'`

4. **Ou compile e execute via terminal:**

   ```bash
   cd BankingSystem/src
   javac Main.java
   java Main
   ```

---

## 📌 Status do Projeto

🟡 **Em desenvolvimento / Aprendizado** — Este projeto faz parte de uma jornada de aprendizado em Java. Melhorias e novas funcionalidades podem ser adicionadas ao longo do tempo.

---

## 👨‍💻 Autor

Desenvolvido por **Calebe** como parte do seu processo de aprendizado em Java.

- GitHub: [@Calebe022](https://github.com/Calebe022)

---

## 📄 Licença

Este projeto está sob uso livre para fins educacionais.
