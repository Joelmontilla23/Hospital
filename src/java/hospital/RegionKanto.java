/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Joel Montilla
 */
public class RegionKanto implements IImprimision {
    ListaPacientes Kanto = new ListaPacientes();
    @Override

    public String impresion() {
        return Kanto.ListaKanto();
        }

    public RegionKanto() {
    }

    
}
