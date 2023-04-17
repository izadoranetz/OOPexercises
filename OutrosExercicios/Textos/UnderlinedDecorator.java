public class UnderlinedDecorator extends Decorator
{
  /**
   * Construtor para inicializar o componente
   *
   * @param component referencia para um objeto Component
   */
  public UnderlinedDecorator(Text component)
  {
    super(component);
  }

  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.TextStyle#render()
   */
  public String render()
  {
    return "<s>" + super.render() + "</s>";
  }
}