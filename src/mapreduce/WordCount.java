package mapreduce;

import javax.security.auth.login.Configuration;
import java.io.IOException;
import java.lang.Class;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

//public class WordCount {
//
//        static class WordCountMapper extend Mapper<LongWritable,Text,Text,IntWritable>{
//            protected void map(LongWritable key, Text value, Context context) throws Exception{
//                String line = value.toString();
//                String[] words = line.split(" ");
//                for(String word:words){
//                    context.write(new Text(word), new IntWritable(1));
//                }
//            }
//        }
//
//        static class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
//            protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws Exception{
//                int count = 0;
//                for(IntWritable value:values){
//                    count += value.get();
//                }
//                context.write(key, new IntWritable(count));
//            }
//        }
//
//        static class WordcountCombiner extends Reducer<Text, IntWritable, Text, IntWritable>{
//            protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException,InterruptedException {
//                int count = 0;
//                for(IntWritable v:values){
//                    count += v.get();
//                }
//                context.write(key, new IntWritable(count));
//            }
//        }
//
//        public static void main(String[] args) throws Exception {
//            Configuration conf = new Configuration();
//            /**
//             * 本地运行不用配置conf
//             * 到hdfs和yarn集群上运行要打jar包去linux运行
//             *
//             * /
//
//             /**
//             * 集群运行需要配置
//             * conf.set("mapreduce.framework.name","yarn");
//             * conf.set("yarn.resourcemanager.hostname","shizhan");
//             * conf.set("fs.defaultFS","hdfs://shizhan:9000");
//             */
//
//            Job job = Job.getInstance(conf);
//
//            //指定本程序所在jar包的所在路径
//            job.setJarByClass(WordcountDriver.class);
//
//            //指定本业务job要使用的Mapper/Reducer业务类
//            job.setMapperClass(WordcountMapper.class);
//            job.setReducerClass(WordcountReducer.class);
//
//            //指定Combiner业务类
//            job.setCombinerClass(WordcountCombiner.class);
//
//            job.setInputFormatClass(CombineTextInputFormat.class);
//            CombineTextInputFormat.setMaxInputSplitSize(job, 4194304);
//            CombineTextInputFormat.setMinInputSplitSize(job, 2097152);
//
//            //指定mapper输出数据的kv类型
//            job.setMapOutputKeyClass(Text.class);
//            job.setMapOutputValueClass(IntWritable.class);
//
//            //指定最终的输出kv类型
//            job.setOutputKeyClass(Text.class);
//            job.setOutputValueClass(IntWritable.class);
//
//            //制定job的输入原始数据的目录hdfs
//            FileInputFormat.setInputPaths(job, new Path(args[0]));
//
//            //制定job的输出结果的目录hdfs
//            FileOutputFormat.setOutputPath(job, new Path(args[1]));
//
//            //提交任务给yarn
//            /*job.submit();*/
//            boolean res = job.waitForCompletion(true);
//            System.exit(res?0:1);
//        }
//}
