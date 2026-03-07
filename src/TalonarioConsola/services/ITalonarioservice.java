package TalonarioConsola.services;

import TalonarioConsola.model.Talonario;

public interface ITalonarioservice {

	public boolean guardar (Talonario talonario);
	public Talonario recuperar (Talonario talonario);
	public Talonario modificar (Talonario talonario);
	public boolean eliminar (Talonario talonario);
}
