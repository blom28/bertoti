# Engenharia de Software

## Atividade 1 - Software é intangível (trecho do livro Software Engineering at Google, ver slide 4)
*Comentar com suas palavras*

O primeiro trecho diferencia programação, ciência da computação e engenharia de software. Programação está ligada ao ato de escrever código. Ciência da computação é mais teórica e acadêmica. Já a engenharia de software envolve aplicar conhecimento técnico para construir sistemas reais de forma estruturada.

## Atividade 2 -  Engenharia de Software = Programação + tempo, escalabilidade e trade-offs (trecho do livro Software Engineering at Google, ver slide 7)
*Comentar com suas palavras*

O segundo trecho define engenharia de software como “programação ao longo do tempo”. Ou seja, não é apenas escrever código que funcione hoje, mas garantir que ele seja sustentável e possa evoluir.

## Atividade 3 - Listar 5 requisitos não funcionais e descrevê-los com suas palavras (ver slides 8, 9 e 10)
Nível de Serviço vs. Custos de Inventário Na cadeia de suprimentos, as empresas precisam decidir como atender o cliente sem falir. O Trade-off: Aumentar o nível de serviço (ter todos os produtos prontos para entrega imediata) exige altos custos de inventário (estoque alto e caro) e alto custo de armazenagem. Assim como Mercado Livre fez atualmente, aumentando sua capacidade de armazenamento. A escolha: Manter estoque alto (cliente satisfeito, mas alto custo operacional) OU manter estoque baixo (reduz custos, mas arrisca não ter produto para vender - ruptura)

## Atividade 4 - Citar e descrever 3 cenários de trade-offs (ver slide 12, mas usar outros exemplos)
 Velocidade vs Qualidade – Entregar rápido pode gerar código difícil de manter depois.

 Simplicidade vs Escalabilidade – Um sistema simples é mais fácil no início, mas pode não suportar crescimento futuro.

 Custo vs Segurança – Reduzir custos pode comprometer a proteção do sistema.

## Atividade 5 - É possivel testar tudo?
```C#
int blech (int g)

  j = j - 1 // deveria ser j = j + 1
  
  j = j/30000
  
   return = j 
   
   }
```
**1.** Quantas entradas mostram o erro?
R: 4 entradas

**2.** Quais são?
R: 29.999, 30.000, -29.0000, -30.000
