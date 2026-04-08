# ⏱️ POO Tempo em Java

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando o funcionamento de um relógio (hora, minuto e segundo).

---

## 🚀 Funcionalidades

- ✔️ Manipulação de horas, minutos e segundos  
- ✔️ Incremento de tempo (segundos, minutos e horas)  
- ✔️ Decremento de tempo com tratamento de limites  
- ✔️ Conversão do tempo total para segundos  
- ✔️ Formatação do horário no padrão `hh:mm:ss`  

---

## 🧠 Conceitos aplicados

- Encapsulamento (`private`, getters e setters)
- Construtores
- Regras de negócio (validação de tempo)
- Métodos encadeados
- Formatação de saída com `String.format`

---

## 📦 Estrutura do projeto

src/
├── principal/
│ └── Principal.java
└── model/
└── Relogio.java

---

## 💻 Exemplo de uso

```java
Tempo t = new Tempo(1, 59, 58);

System.out.println(t.getTempoFormatado());

t.incrementarSegundo();

System.out.println(t.getTempoFormatado());
```
🖥️ Saída esperada
01:59:58
01:59:59
02:00:00
