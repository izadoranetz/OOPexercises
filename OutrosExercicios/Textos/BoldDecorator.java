public class BoldDecorator extends Decorator
{
  /**
   * Construtor para inicializar o componente
   *
   * @param component referencia para um objeto Component
   */
  public BoldDecorator(Text component)
  {
    super(component);
  }

  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.TextStyle#render()
   */
  public String render()
  {
    return "<b>" + super.render() + "</b>";
  }
}