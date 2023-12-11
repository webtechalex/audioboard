import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import org.springframework.jdbc.datasource.DriverManagerDataSource
import javax.sql.DataSource

@Configuration
@EnableJdbcRepositories(basePackages = ["com.audioboard.metadata.repository"])
class JdbcConfig {
    @Value("\${spring.datasource.url}")
    private val dbUrl: String? = null

    @Value("\${spring.datasource.username}")
    private val dbUsername: String? = null

    @Value("\${spring.datasource.password}")
    private val dbPassword: String? = null

    @Bean
    fun dataSource(): DataSource {
        val dataSource = DriverManagerDataSource()
        dataSource.setDriverClassName("org.h2.Driver")
        dataSource.url = dbUrl
        dataSource.username = dbUsername
        dataSource.password = dbPassword
        return dataSource
    }
}