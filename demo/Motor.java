package demo;

import packageUno.Injected;
import packageUno.Piston;

@Component
public class Motor
{
	@Injected(count = 204)
	private Piston piston;
}
