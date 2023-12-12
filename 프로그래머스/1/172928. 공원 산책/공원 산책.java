class Solution {
    public int[] solution(String[] park, String[] routes) {
        int point_X = 0, point_Y = 0;
        String[][] park_coordinate = new String[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                park_coordinate[i][j] = String.valueOf(park[i].charAt(j));
                if(park_coordinate[i][j].equals("S")){
                    point_X = i;
                    point_Y = j;
                }
            }
        }

        for(String route : routes) {
            String[] route_info = route.split(" ");
            String route_direction = route_info[0];
            int route_degree = Integer.parseInt(route_info[1]);
            boolean obstacle = false;
            switch (route_direction) {
                case "E" -> {
                    if(point_Y + route_degree < park_coordinate[0].length){
                        for(int i = point_Y + 1; i <= point_Y + route_degree; i++){
                            if (park_coordinate[point_X][i].contains("X")) {
                                obstacle = true;
                                break;
                            }
                        }
                        if(!obstacle){
                            point_Y += route_degree;
                        }
                    }
                }
                case "W" -> {
                    if(point_Y - route_degree >= 0){
                        for(int i = point_Y - 1; i >= point_Y - route_degree; i--){
                            if (park_coordinate[point_X][i].contains("X")) {
                                obstacle = true;
                                break;
                            }
                        }
                        if(!obstacle){
                            point_Y -= route_degree;
                        }
                    }
                }
                case "S" -> {
                    if(point_X + route_degree < park_coordinate.length){
                        for(int i = point_X + 1; i <= point_X + route_degree; i++){
                            if (park_coordinate[i][point_Y].contains("X")) {
                                obstacle = true;
                                break;
                            }
                        }
                        if(!obstacle){
                            point_X += route_degree;
                        }
                    }
                }
                case "N" -> {
                    if(point_X - route_degree >= 0){
                        for(int i = point_X - 1; i >= point_X - route_degree; i--){
                            if (park_coordinate[i][point_Y].contains("X")) {
                                obstacle = true;
                                break;
                            }
                        }
                        if(!obstacle){
                            point_X -= route_degree;
                        }
                    }
                }
            }
        }
        return new int[]{point_X, point_Y};
    }
}