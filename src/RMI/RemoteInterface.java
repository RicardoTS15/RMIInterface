/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;

/**
 *
 * @author Ricardo
 */
public interface RemoteInterface extends Remote {
    public String getAlumno(String pattern) throws Exception;
    public String getUnidadAcademica(String pattern) throws Exception;
    public String getProgramaAcademico(String pattern) throws Exception;
    public String getPlanEstudioc(String pattern) throws Exception;
    public String getHistorialAcademico(int alumnoID) throws Exception;
    public String getEstadisticas() throws Exception;
}
