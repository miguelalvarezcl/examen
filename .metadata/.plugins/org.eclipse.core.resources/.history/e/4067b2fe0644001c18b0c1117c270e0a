package com.platinum;
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class ControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UsuariobdDAO usuariobdDAO;
    private PersonabdDAO personabdDAO;
    private CuentabdDAO cuentabdDAO;
    private TransferenciaDAO transferenciaDAO;
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        usuariobdDAO = new UsuariobdDAO(jdbcURL, jdbcUsername, jdbcPassword);
        personabdDAO = new PersonabdDAO(jdbcURL, jdbcUsername, jdbcPassword);
        cuentabdDAO = new CuentabdDAO(jdbcURL, jdbcUsername, jdbcPassword);
        transferenciaDAO = new TransferenciaDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
 
        try {
            switch (action) {
            case "/new":
                showNewForm(request, response);
                break;
            case "/newpersona":
                showNewFormPersona(request, response);
                break;

            case "/newcuenta":
                showNewFormCuenta(request, response);
                break;                

            case "/newtransferencia":
                showNewFormTransferencia(request, response);
                break;                 
                
            case "/insert":
                insertUsuariobd(request, response);
                break;
                
            case "/insertpersona":
                insertPersonabd(request, response);
                break;                

            case "/insertcuenta":
                insertCuentabd(request, response);
                break;                

            case "/inserttransferencia":
                insertTransferencia(request, response);
                break;                  
            case "/deletecuenta":
                deleteCuentabd(request, response);
                break; 
                
            case "/deletepersona":
                deletePersonabd(request, response);
                break;                
            case "/delete":
                deleteUsuariobd(request, response);
                break;
            case "/editpersona":
                showEditFormPersona(request, response);
                break;
                
            case "/editcuenta":
                showEditFormCuenta(request, response);
                break;                  
                
            case "/edit":
                showEditForm(request, response);
                break;
            case "/update":
                updateUsuariobd(request, response);
                break;
            case "/updatepersona":
                updatePersonabd(request, response);
                break;
                
            case "/updatecuenta":
                updateCuentabd(request, response);
                break;

            
            case "/listPersonabd":
            	listPersonabd(request, response);
                break;

            case "/listCuentabd":
            	//System.out.println("1");
            	listCuentabd(request, response);
                break;
            case "/listTransferencia":
            	System.out.println("1");
            	listTransferencia(request, response);
                break;                
            default:
                listUsuariobd(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
 
    

    private void listTransferencia(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {


        List<Transferencia> listTransferencia = transferenciaDAO.listAllTransferencia();
										 
        request.setAttribute("listTransferencia", listTransferencia);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListaTransferencia.jsp");
        dispatcher.forward(request, response);
    }    

    private void listCuentabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {


        List<Cuentabd> listCuentabd = cuentabdDAO.listAllCuentabd();
										 
        request.setAttribute("listCuentabd", listCuentabd);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListaCuentas.jsp");
        dispatcher.forward(request, response);
    }    
    
    private void listPersonabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        List<Personabd> listPersonabd = personabdDAO.listAllPersonabd();
										 
        request.setAttribute("listPersonabd", listPersonabd);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListaPersonas.jsp");
        dispatcher.forward(request, response);
    }
    
    private void listUsuariobd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Usuariobd> listUsuariobd = usuariobdDAO.listAllUsuariosbd();
        request.setAttribute("listUsuariobd", listUsuariobd);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListaUsuarios.jsp");
        dispatcher.forward(request, response);
    }   
    
 
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioUsuario.jsp");
        dispatcher.forward(request, response);
    }
    
    private void showNewFormPersona(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioPersona.jsp");
        dispatcher.forward(request, response);
    }   

    private void showNewFormCuenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioCuenta.jsp");
        dispatcher.forward(request, response);
    }       

    private void showNewFormTransferencia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioTransferencia.jsp");
        dispatcher.forward(request, response);
    }     
    
    
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Usuariobd existingUsuariobd = usuariobdDAO.getUsuariobd(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioUsuario.jsp");
        request.setAttribute("usuariobd", existingUsuariobd);
        dispatcher.forward(request, response);
 
    }

    private void showEditFormPersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String rut = request.getParameter("rut");
        Personabd existingPersonabd = personabdDAO.getPersonabd(rut);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioPersona.jsp");
        request.setAttribute("personabd", existingPersonabd);
        dispatcher.forward(request, response);
        
 
    }
    
    private void showEditFormCuenta(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Cuentabd existingCuentabd = cuentabdDAO.getCuentabd(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioCuenta.jsp");
        request.setAttribute("cuentabd", existingCuentabd);
        dispatcher.forward(request, response);
        
 
    }    
    
    private void insertUsuariobd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String nombreusuario = request.getParameter("nombreusuario");
        String password = request.getParameter("password");

 
        Usuariobd newUsuariobd = new Usuariobd(nombreusuario, password);
        usuariobdDAO.insertUsuariobd(newUsuariobd);
        response.sendRedirect("list");
    }

    private void insertPersonabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
 
        Personabd newPersonabd = new Personabd(rut,nombre, apellido,direccion,correo,telefono);
        personabdDAO.insertPersonabd(newPersonabd);
        response.sendRedirect("listPersonabd");
    }

    private void insertTransferencia(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String rutpersona = request.getParameter("rutpersona");
        int idusuario = Integer.parseInt(request.getParameter("idusuario"));
        int idcuenta = Integer.parseInt(request.getParameter("idcuenta"));
        int montotransferencia = Integer.parseInt(request.getParameter("montotransferencia"));
        int cuentatransferencia = Integer.parseInt(request.getParameter("cuentatransferencia"));
        String tipocuenta = request.getParameter("tipocuenta");
        
        Transferencia newTransferencia = new Transferencia(rutpersona, idusuario,idcuenta,montotransferencia,cuentatransferencia,tipocuenta);
        transferenciaDAO.insertTransferencia(newTransferencia);
        response.sendRedirect("listTransferencia");
    }
    
    private void insertCuentabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String rutcliente = request.getParameter("rutcliente");
        String monto = request.getParameter("monto");
        String ejecutivo = request.getParameter("ejecutivo");
 
        Cuentabd newCuentabd = new Cuentabd(rutcliente, monto,ejecutivo);
        cuentabdDAO.insertCuentabd(newCuentabd);
        response.sendRedirect("listCuentabd");
    }
    
    
    private void updatePersonabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
       
 
        Personabd personabd = new Personabd(rut, nombre, apellido,direccion,correo,telefono);
        personabdDAO.updatePersonabd(personabd);
        response.sendRedirect("listPersonabd");
    }    
    

    private void updateCuentabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	System.out.println("paso");
        
        String rutcliente = request.getParameter("rutcliente");
        String monto = request.getParameter("monto");
        String ejecutivo = request.getParameter("ejecutivo");
        int id = Integer.parseInt(request.getParameter("id"));
        Cuentabd cuentabd = new Cuentabd(id, rutcliente, monto , ejecutivo);
        System.out.println("paso2");
        cuentabdDAO.updateCuentabd(cuentabd);
        response.sendRedirect("listCuentabd");
    }
    
    
    private void updateUsuariobd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombreusuario = request.getParameter("nombreusuario");
        String password = request.getParameter("password");
       
 
        Usuariobd usuariobd = new Usuariobd(id, nombreusuario, password);
        usuariobdDAO.updateUsuariobd(usuariobd);
        response.sendRedirect("list");
    }
 
    private void deleteUsuariobd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
 
        Usuariobd usuariobd = new Usuariobd(id);
        usuariobdDAO.deleteUsuariobd(usuariobd);
        response.sendRedirect("list");
 
    }
    
    private void deletePersonabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String rut = request.getParameter("rut");
 
        Personabd personabd = new Personabd(rut);
        personabdDAO.deletePersonabd(personabd);
        response.sendRedirect("listPersonabd"); 
    }   

    
    private void deleteCuentabd(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
 
        Cuentabd cuentabd = new Cuentabd(id);
        cuentabdDAO.deleteCuentabd(cuentabd);
        response.sendRedirect("listCuentabd"); 
    }   
    
    
    
}