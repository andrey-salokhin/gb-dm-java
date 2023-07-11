// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Д
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package lesson2_hw;

public class SqlRequestGeneration {

    public static void main(String[] args) {
            StringBuilder sql_request = new StringBuilder("select * from students where ");
            String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            String [] parsed_json = parseJsonToArray(json);
            for (int i = 0; i < parsed_json.length; i++) {
                String [] where_statement_sql_array = parsed_json[i].split(":");
                if(where_statement_sql_array[1] != "null") {
                    sql_request.append(where_statement_sql_array[0]);
                    sql_request.append(" = ");
                    sql_request.append(where_statement_sql_array[1]);
                    if(i < parsed_json.length - 1) {
                        sql_request.append("\n AND \n");
                    }
                }
            }

            System.out.println(sql_request);
    }

    public static String[] parseJsonToArray(String json_string) {
        return json_string.replace("{", "").replace("}", "").replaceAll("\"", "").split(",");
    }


}
