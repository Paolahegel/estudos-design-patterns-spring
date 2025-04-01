# 📌 Estudos sobre Design Patterns no Java e Spring

Este repositório contém implementações dos padrões de projeto Singleton, Strategy e Facade, vistos em aula de Design Patterns durante o Bootcamp Java Cloud na [Digital Innovation One](https://www.dio.me/).
O objetivo foi entender suas aplicações tanto no Java puro quanto no contexto do Spring Framework.

## 📖 Sobre o estudo
Para aprofundar meu conhecimento, dividi o aprendizado em duas etapas:

1️⃣ **Implementação no "Java puro"**:
   - Construção dos padrões do zero, sem o uso de frameworks.
   - Análise da estrutura, fundamentos e funcionamento sem abstrações adicionais.

2️⃣ **Aplicação no Spring Framework**:
   - Reimplementação utilizando recursos do Spring para explorar a injeção de dependências e gerenciamento de instâncias.

## 🛠️ Tecnologias e ferramentas utilizadas
- **Java** ☕
- **Spring Framework** 🌱
- **Maven** 📦
- **Git e GitHub** 🐙
- **IDE: IntelliJ IDEA** 💻

## 💡 Padrões estudados

### ✅ Singleton
Garante que uma classe tenha apenas uma instância em todo o ciclo de vida da aplicação.
No Spring, esse comportamento é gerenciado automaticamente através de anotações como `@Component` e `@Bean`.

### ✅ Strategy
Permite definir uma família de algoritmos e alterná-los dinamicamente.
No Spring, a implementação fica mais prática com o uso de `@Component` e `@Autowired` para a injeção de dependências.

### ✅ Facade
Fornece uma interface simplificada para interagir com sistemas mais complexos.
No Spring, essa abordagem é aplicada por meio de services que encapsulam chamadas a repositórios e outros componentes, tornando o código mais organizado e limpo.

## 🚀 Aprendizados e reflexões
- Compreender os padrões "na raiz" ajuda a visualizar melhor sua importância antes de utilizá-los em frameworks.
- O Spring facilita muito a implementação dos padrões, mas é essencial conhecer os conceitos fundamentais para aplicá-los corretamente.
- A prática foi essencial para consolidar os conceitos e entender como cada padrão pode ser aplicado a diferentes cenários.

## 🌍 Atualizações
Feedbacks e sugestões são bem-vindas! Fique à vontade para contribuir e potencializar meu aprendizado 😃

