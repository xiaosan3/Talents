package com.longmingxin.talent.talents.bean;

import java.util.List;

/**
 * Created by ASUS on 2018/10/3.
 */

public class HomePagerBean {

    /**
     * success : true
     * data : {"notices":"xxx1通过xxx培训，取得xxx资格证书|xxx2通过xxx培训，取得xxx资格证书","adImage":"/images/20121121/1.jpg","recruitshelp":[{"pic":"/images/20121121/3.jpg","content":"顺服二厂急招建筑工程师5人，待遇从优"},{"pic":"/images/20121121/1.jpg","content":"顺服三厂急招建筑工程师3人，待遇从优"}],"projects":[{"pic":"/images/20121121/1.jpg","projectName":"碧桂园二期项目","location":"江苏 溧阳","recruitingNumbers":"招20人","describe":"长期招聘水电工、泥瓦工等"},{"pic":"/images/20121121/2.jpg","projectName":"万达广场一期项目","location":"江苏 溧阳","recruitingNumbers":"招200人","describe":"长期招聘水电工、泥瓦工等"},{"pic":"/images/20121121/3.jpg","projectName":"万达广场二期项目","location":"江苏 溧阳","recruitingNumbers":"招200人","describe":"长期招聘水电工、泥瓦工等"}],"jobs":[{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-济南市","workExperience":"三年经验","degree":"大专及以上学历","pubDate":"2018-09-12"},{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-菏泽市","workExperience":"四年经验","degree":"","pubDate":"2018-09-12"},{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-德州市","workExperience":"","degree":"","pubDate":"2018-09-12"},{"jobName":"设计师","salaryRange":"10-15千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-济南市","workExperience":"三年经验","degree":"大专及以上学历","pubDate":"2018-09-12"}],"updatetime":1538559380,"banners":"/images/201801/1.jpg,/images/201801/2.jpg","learnTags":"水电工,1101|焊工,1102|建筑师,1103|设计师,1104"}
     * message : null
     */

    private boolean success;
    private DataBean data;
    private Object message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HomePagerBean{" +
                "success=" + success +
                ", data=" + data +
                ", message=" + message +
                '}';
    }

    public static class DataBean {
        /**
         * notices : xxx1通过xxx培训，取得xxx资格证书|xxx2通过xxx培训，取得xxx资格证书
         * adImage : /images/20121121/1.jpg
         * recruitshelp : [{"pic":"/images/20121121/3.jpg","content":"顺服二厂急招建筑工程师5人，待遇从优"},{"pic":"/images/20121121/1.jpg","content":"顺服三厂急招建筑工程师3人，待遇从优"}]
         * projects : [{"pic":"/images/20121121/1.jpg","projectName":"碧桂园二期项目","location":"江苏 溧阳","recruitingNumbers":"招20人","describe":"长期招聘水电工、泥瓦工等"},{"pic":"/images/20121121/2.jpg","projectName":"万达广场一期项目","location":"江苏 溧阳","recruitingNumbers":"招200人","describe":"长期招聘水电工、泥瓦工等"},{"pic":"/images/20121121/3.jpg","projectName":"万达广场二期项目","location":"江苏 溧阳","recruitingNumbers":"招200人","describe":"长期招聘水电工、泥瓦工等"}]
         * jobs : [{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-济南市","workExperience":"三年经验","degree":"大专及以上学历","pubDate":"2018-09-12"},{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-菏泽市","workExperience":"四年经验","degree":"","pubDate":"2018-09-12"},{"jobName":"土木/土建专业监理工程师","salaryRange":"6-10千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-德州市","workExperience":"","degree":"","pubDate":"2018-09-12"},{"jobName":"设计师","salaryRange":"10-15千/月","enterpriseName":"东莞市大业建筑技术咨询有限公司","location":"山东-济南市","workExperience":"三年经验","degree":"大专及以上学历","pubDate":"2018-09-12"}]
         * updatetime : 1538559380
         * banners : /images/201801/1.jpg,/images/201801/2.jpg
         * learnTags : 水电工,1101|焊工,1102|建筑师,1103|设计师,1104
         */

        private String notices;
        private String adImage;
        private int updatetime;
        private String banners;
        private String learnTags;
        private List<RecruitshelpBean> recruitshelp;
        private List<ProjectsBean> projects;
        private List<JobsBean> jobs;

        public String getNotices() {
            return notices;
        }

        public void setNotices(String notices) {
            this.notices = notices;
        }

        public String getAdImage() {
            return adImage;
        }

        public void setAdImage(String adImage) {
            this.adImage = adImage;
        }

        public int getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(int updatetime) {
            this.updatetime = updatetime;
        }

        public String getBanners() {
            return banners;
        }

        public void setBanners(String banners) {
            this.banners = banners;
        }

        public String getLearnTags() {
            return learnTags;
        }

        public void setLearnTags(String learnTags) {
            this.learnTags = learnTags;
        }

        public List<RecruitshelpBean> getRecruitshelp() {
            return recruitshelp;
        }

        public void setRecruitshelp(List<RecruitshelpBean> recruitshelp) {
            this.recruitshelp = recruitshelp;
        }

        public List<ProjectsBean> getProjects() {
            return projects;
        }

        public void setProjects(List<ProjectsBean> projects) {
            this.projects = projects;
        }

        public List<JobsBean> getJobs() {
            return jobs;
        }

        public void setJobs(List<JobsBean> jobs) {
            this.jobs = jobs;
        }


        public static class RecruitshelpBean {
            /**
             * pic : /images/20121121/3.jpg
             * content : 顺服二厂急招建筑工程师5人，待遇从优
             */

            private String pic;
            private String content;

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            @Override
            public String toString() {
                return "RecruitshelpBean{" +
                        "pic='" + pic + '\'' +
                        ", content='" + content + '\'' +
                        '}';
            }
        }


        public static class ProjectsBean {
            /**
             * pic : /images/20121121/1.jpg
             * projectName : 碧桂园二期项目
             * location : 江苏 溧阳
             * recruitingNumbers : 招20人
             * describe : 长期招聘水电工、泥瓦工等
             */

            private String pic;
            private String projectName;
            private String location;
            private String recruitingNumbers;
            private String describe;

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getProjectName() {
                return projectName;
            }

            public void setProjectName(String projectName) {
                this.projectName = projectName;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getRecruitingNumbers() {
                return recruitingNumbers;
            }

            public void setRecruitingNumbers(String recruitingNumbers) {
                this.recruitingNumbers = recruitingNumbers;
            }

            public String getDescribe() {
                return describe;
            }

            public void setDescribe(String describe) {
                this.describe = describe;
            }

            @Override
            public String toString() {
                return "ProjectsBean{" +
                        "pic='" + pic + '\'' +
                        ", projectName='" + projectName + '\'' +
                        ", location='" + location + '\'' +
                        ", recruitingNumbers='" + recruitingNumbers + '\'' +
                        ", describe='" + describe + '\'' +
                        '}';
            }
        }


        public static class JobsBean {
            /**
             * jobName : 土木/土建专业监理工程师
             * salaryRange : 6-10千/月
             * enterpriseName : 东莞市大业建筑技术咨询有限公司
             * location : 山东-济南市
             * workExperience : 三年经验
             * degree : 大专及以上学历
             * pubDate : 2018-09-12
             */

            private String jobName;
            private String salaryRange;
            private String enterpriseName;
            private String location;
            private String workExperience;
            private String degree;
            private String pubDate;

            public String getJobName() {
                return jobName;
            }

            public void setJobName(String jobName) {
                this.jobName = jobName;
            }

            public String getSalaryRange() {
                return salaryRange;
            }

            public void setSalaryRange(String salaryRange) {
                this.salaryRange = salaryRange;
            }

            public String getEnterpriseName() {
                return enterpriseName;
            }

            public void setEnterpriseName(String enterpriseName) {
                this.enterpriseName = enterpriseName;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getWorkExperience() {
                return workExperience;
            }

            public void setWorkExperience(String workExperience) {
                this.workExperience = workExperience;
            }

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "notices='" + notices + '\'' +
                    ", adImage='" + adImage + '\'' +
                    ", updatetime=" + updatetime +
                    ", banners='" + banners + '\'' +
                    ", learnTags='" + learnTags + '\'' +
                    ", recruitshelp=" + recruitshelp +
                    ", projects=" + projects +
                    ", jobs=" + jobs +
                    '}';
        }
    }
}
