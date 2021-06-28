# S.O.L.I.D

SOLID é um acrônimo dos princípios da programação orientada a objetos descritas por Robert C. Martin("Uncle Bob").

Esses princípios auxiliam o programador a escrever **códigos** mais **limpos, facilitando** a **refatoração** e estimulando o **reaproveitamento do código**.

## S - Single Responsibility 

Uma classe deve possuir apenas uma única responsabilidade dentro do software.

## O - Open Closed 

Você deve poder estender um comportamento de classe, sem modificá-lo.

- Objetos devem estar **abertos para extensão**, mas **fechados para modificação**.

- Quando novos comportamentos precisam ser adicionados no software, **devemos estender e não alterar o código fonte original**.

## L - Liskov Substitution

Classes derivadas devem ser substituíveis por suas classes base.

- O princípio da substituição foi introduzido por Barbara Liskov em 1987:
    - "Se para cada objeto **o1** do **tipo S** há um objeto **o2** do **tipo T** de forma que, para todos os **programas P**, o comportamento de **P** é inalterado quando **o1** é substituído or **o2**, então **S é um subtipo de T**."
    
## I - Interface Segregation

Faça interfaces refinadas que são específicas do cliente.

- Uma classe **não deve** ser forçada a **implementar** interfaces e **métodos** que **não serão utilizados**.

- É melhor criar **interfaces** mas **específicas** ao **invés de** termos uma única **interface genérica**.

## D - Dependency Inversion

Depende de abstrações e não de implementações.

- Um módulo de alto nível não deve depender de módulos de baixo nível, ambos devem depender da abstração.

- PS: Inversão de Dependência **não é** igual a Injeção de Dependência.
