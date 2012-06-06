package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;


@ServletSecurity(httpMethodConstraints = {@HttpMethodConstraint(value = "GET",
		rolesAllowed = {"admins"}, transportGuarantee = TransportGuarantee.CONFIDENTIAL)})
		
@WebFilter("/LogonFilter")
public class LogonFilter implements Filter {


    public LogonFilter() {
      
    }

	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {	
	}

}
