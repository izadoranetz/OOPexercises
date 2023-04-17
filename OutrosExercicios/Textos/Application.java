// http://www.ybadoo.com.br/tutoriais/poo/09/24/

/*************************************************************************
 * Copyright (C) 2009/2023 - Cristiano Lehrer (cristiano@ybadoo.com.br)  *
 *                  Ybadoo - Solucoes em Software Livre (ybadoo.com.br)  *
 *                                                                       *
 * Permission is granted to copy, distribute and/or modify this document *
 * under the terms of the GNU Free Documentation License, Version 1.3 or *
 * any later version published by the  Free Software Foundation; with no *
 * Invariant Sections,  no Front-Cover Texts, and no Back-Cover Texts. A *
 * A copy of the  license is included in  the section entitled "GNU Free *
 * Documentation License".                                               *
 *************************************************************************/

import java.util.Map;

/**
 * Classe responsavel pela execucao do padrao Decorator
 */
public class Application
{
  /**
   * Metodo principal da linguagem de programacao Java
   * 
   * @param args argumentos da linha de comando (nao utilizado)
   */
  public static void main(String[] args)
  {
    Phrase phrase = new Phrase();

    phrase.add(new Word("normal"));

    phrase.add(new BoldDecorator(new Word("negrito")));

    phrase.add(new ItalicDecorator(new Word("itálico")));

    phrase.add(new UnderlinedDecorator(new Word("sublinhado")));

    phrase.add(new BoldDecorator(
               new ItalicDecorator(new Word("negrito e itálico"))));

    phrase.add(new ItalicDecorator(
               new UnderlinedDecorator(new Word("itálico sublinhado"))));

    System.out.println(phrase);
  }
}