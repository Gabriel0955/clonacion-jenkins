@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.*
import org.apache.commons.lang.StringUtils

// Crear un cliente RESTClient para probar la importación
def client = new RESTClient('https://jsonplaceholder.typicode.com')

// Realizar una solicitud GET a un recurso
def response = client.get(path: '/posts/1')
println "Status Code: ${response.status}"
println "Response Body:"
println response.data

// Verificar si StringUtils está funcionando
def str = "Hello, world!"
println "Is empty: ${StringUtils.isEmpty(str)}"
