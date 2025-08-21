# JSplitPane - Uso do método setDividerLocation

O componente `JSplitPane` divide a janela em duas áreas (esquerda/direita ou cima/baixo) com uma barra divisória ajustável.

## Funcionamento do `setDividerLocation`

O método `setDividerLocation` define a posição inicial da barra divisória. Ele pode ser usado de duas formas:

- **Por pixels (int)**
  ```java
  splitPane.setDividerLocation(150);
  ```
  Define a posição da divisória a **150 pixels da borda esquerda** (em `HORIZONTAL_SPLIT`) ou superior (em `VERTICAL_SPLIT`).

- **Por proporção (double entre 0.0 e 1.0)**
  ```java
  splitPane.setDividerLocation(0.4);
  ```
  Define a divisória em **40% do tamanho total** da largura (horizontal) ou altura (vertical).  
  - Exemplo: `0.4` → 40% para o painel esquerdo, 60% para o painel direito.

## Observações importantes
- A versão com proporção (`double`) só funciona corretamente **após o `JSplitPane` ser exibido** na tela (`setVisible(true)`), pois depende do tamanho real da janela.
- Também é possível ajustar a **espessura da barra** com:
  ```java
  splitPane.setDividerSize(10);
  ```

---
✅ No exemplo dado, `splitPane.setDividerLocation(0.4);` posiciona a barra em 40% da largura total, deixando 40% para o painel vermelho (esquerda) e 60% para o painel azul (direita).
