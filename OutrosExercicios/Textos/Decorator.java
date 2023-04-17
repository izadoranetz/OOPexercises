public class Decorator implements Text
{
  /**
   * Referencia para um objeto Component
   */
  private Text component;

  /**
   * Construtor para inicializar o componente
   *
   * @param component referencia para um objeto Component
   */
  public Decorator(Text component)
  {
    this.component = component;
  }

  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.TextStyle#render()
   */
  public String render()
  {
    return component.render();
  }
}