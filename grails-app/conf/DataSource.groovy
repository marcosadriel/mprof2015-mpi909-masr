dataSource {
   pooled = true
   driverClassName = "org.postgresql.Driver"
   dialect = org.hibernate.dialect.PostgreSQLDialect
   username = "lwgbkeolptukot"
   password = "JfmDxHRK-WjQwV2WldWUA-7qzH"
}
hibernate {
   cache.use_second_level_cache = true
   cache.use_query_cache = true
   cache.provider_class='org.hibernate.cache.EhCacheProvider'
}
// environment specific settings
environments {
   development {
      dataSource {
         dbCreate = "update"
         url = "jdbc:postgres://lwgbkeolptukot:JfmDxHRK-WjQwV2WldWUA-7qzH@ec2-54-204-3-200.compute-1.amazonaws.com:5432/dcllk4b199ecu0"
         username = "lwgbkeolptukot"
         password = "JfmDxHRK-WjQwV2WldWUA-7qzH"
      }
   }
   test {
      dataSource {
         dbCreate = "update"
         url = "jdbc:postgres://lwgbkeolptukot:JfmDxHRK-WjQwV2WldWUA-7qzH@ec2-54-204-3-200.compute-1.amazonaws.com:5432/dcllk4b199ecu0"
         username = "lwgbkeolptukot"
         password = "JfmDxHRK-WjQwV2WldWUA-7qzH"      }
   }
   production {
      dataSource {
         dbCreate = "update"
         url = "jdbc:postgres://lwgbkeolptukot:JfmDxHRK-WjQwV2WldWUA-7qzH@ec2-54-204-3-200.compute-1.amazonaws.com:5432/dcllk4b199ecu0"
         username = "lwgbkeolptukot"
         password = "JfmDxHRK-WjQwV2WldWUA-7qzH"      }
   }
}
