package org.example.springpractice.Movie.model;

public class MovieDto
{
    public class MovieRegister
    {
        private String title;
        private String description;
        private Integer time;
        
        public Movie toEntity()
        {
            Movie entity = new Movie();
            entity.setTitle(this.title);
            entity.setDescription(this.description);
            entity.setTime(this.time);
            
            return entity;
        }
        
        public String getTitle()
        {
            return title;
        }
        
        public void setTitle(String title)
        {
            this.title = title;
        }
        
        public String getDescription()
        {
            return description;
        }
        
        public void setDescription(String description)
        {
            this.description = description;
        }
        
        public Integer getTime()
        {
            return time;
        }
        
        public void setTime(Integer time)
        {
            this.time = time;
        }
    }
    public static class MovieRes
    {
        private Integer id;
        private String title;
        private String description;
        private Integer time;
        
        public static MovieRes from(Movie entity)
        {
            MovieDto.MovieRes dto = new MovieDto.MovieRes();
            dto.setId(entity.getId());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setTime(entity.getTime());
            
            return dto;
        }
        
        
        public Integer getId()
        {
            return id;
        }
        
        public void setId(Integer id)
        {
            this.id = id;
        }
        
        public String getTitle()
        {
            return title;
        }
        
        public void setTitle(String title)
        {
            this.title = title;
        }
        
        public String getDescription()
        {
            return description;
        }
        
        public void setDescription(String description)
        {
            this.description = description;
        }
        
        public Integer getTime()
        {
            return time;
        }
        
        public void setTime(Integer time)
        {
            this.time = time;
        }
    }
}
