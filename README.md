# Calculadora de Multas de Velocidade

Este aplicativo Java calcula multas de trânsito com base na velocidade permitida e na velocidade real de um veículo. O aplicativo usa uma interface gráfica com `JOptionPane` para interagir com o usuário e exibir mensagens.

## Descrição

O aplicativo realiza os seguintes passos:
1. Solicita ao usuário que informe o limite de velocidade permitido.
2. Solicita ao usuário que informe a velocidade atual do veículo.
3. Calcula a diferença entre a velocidade atual e a velocidade permitida.
4. Exibe a multa apropriada com base na diferença de velocidade:
   - Sem multa se a diferença for menor ou igual a 0.
   - Multa de R$ 80,00 se a diferença estiver entre 1 e 10.
   - Multa de R$ 120,00 se a diferença estiver entre 11 e 39.
   - Multa de R$ 200,00 se a diferença for de 40 ou mais.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada no aplicativo.
- **javax.swing.JOptionPane**: Usado para criar caixas de diálogo para entrada e saída.
