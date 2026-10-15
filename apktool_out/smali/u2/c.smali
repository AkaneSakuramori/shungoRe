.class public final synthetic Lu2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/shungo/app/InjectorService;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lk3/j;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lk3/l;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/shungo/app/InjectorService;Ljava/lang/String;Lk3/j;Ljava/lang/String;Lk3/l;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/c;->b:Lcom/shungo/app/InjectorService;

    iput-object p2, p0, Lu2/c;->c:Ljava/lang/String;

    iput-object p3, p0, Lu2/c;->d:Lk3/j;

    iput-object p4, p0, Lu2/c;->e:Ljava/lang/String;

    iput-object p5, p0, Lu2/c;->f:Lk3/l;

    iput-object p6, p0, Lu2/c;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    iget-object v2, v1, Lu2/c;->b:Lcom/shungo/app/InjectorService;

    iget-object v3, v1, Lu2/c;->c:Ljava/lang/String;

    iget-object v4, v1, Lu2/c;->d:Lk3/j;

    const-string v5, "com.nianticlabs.pokemongo"

    iget-object v6, v1, Lu2/c;->e:Ljava/lang/String;

    iget-object v7, v1, Lu2/c;->f:Lk3/l;

    const-string v8, "pid=$(pidof com.nianticlabs.pokemongo) && echo \"pid: $pid\""

    iget-object v9, v1, Lu2/c;->g:Ljava/lang/String;

    sget v0, Lcom/shungo/app/InjectorService;->o:I

    const-string v10, "frida-server cmd: "

    const-string v11, "UTF-8"

    const-string v0, "this$0"

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$spawnMode"

    invoke-static {v4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startPogo"

    invoke-static {v6, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$injectionDelayMs"

    invoke-static {v7, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$inject"

    invoke-static {v9, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_1f

    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/String;

    const-string v14, "su"

    const/4 v15, 0x0

    aput-object v14, v13, v15

    invoke-direct {v0, v13}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->environment()Ljava/util/Map;

    move-result-object v12

    const-string v13, "environment(...)"

    invoke-static {v12, v13}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "LANG"

    const-string v14, "en-US.UTF-8"

    invoke-interface {v12, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    iput-object v0, v2, Lcom/shungo/app/InjectorService;->l:Ljava/lang/Process;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    goto/16 :goto_e

    :catch_1
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    goto/16 :goto_d

    :cond_0
    const/4 v0, 0x0

    :goto_1
    new-instance v13, Ljava/io/BufferedWriter;

    new-instance v14, Ljava/io/OutputStreamWriter;

    invoke-direct {v14, v0, v11}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v13, v14}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v13, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    const-string v0, "settings put global block_untrusted_touches 0"

    invoke-virtual {v13, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_1
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "chmod +x "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_2
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_3
    iget-boolean v0, v4, Lk3/j;->b:Z

    if-eqz v0, :cond_8

    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_4

    const-string v13, "fs=$(pidof frida-server) && echo \"frida-server cmd: $(tr \'\\0\' \' \' < /proc/${fs%% *}/cmdline)\" && kill $fs"

    invoke-virtual {v0, v13}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_4
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_5
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_6

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "am force-stop "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_6
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_7
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    goto/16 :goto_4

    :cond_8
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_9
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_a
    iget-wide v13, v7, Lk3/l;->b:J

    const-wide/16 v16, 0x0

    cmp-long v0, v13, v16

    if-lez v0, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v13, v7, Lk3/l;->b:J
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v12, 0x3e8

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    int-to-long v3, v12

    :try_start_1
    div-long/2addr v13, v3

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v12, 0x2e

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v12, v7, Lk3/l;->b:J

    rem-long/2addr v12, v3

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lq3/l;->d3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v3, :cond_b

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "sleep "

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_e

    :cond_b
    :goto_2
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_3

    :cond_c
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    :cond_d
    :goto_3
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_e

    invoke-virtual {v0, v8}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_e
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_f
    :goto_4
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; echo \"injector exited with code $?\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_10
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    :cond_11
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    :cond_12
    new-instance v0, Ljava/io/SequenceInputStream;

    iget-object v3, v2, Lcom/shungo/app/InjectorService;->l:Ljava/lang/Process;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    goto :goto_5

    :cond_13
    const/4 v3, 0x0

    :goto_5
    iget-object v4, v2, Lcom/shungo/app/InjectorService;->l:Ljava/lang/Process;

    if-eqz v4, :cond_14

    invoke-virtual {v4}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v4

    goto :goto_6

    :cond_14
    const/4 v4, 0x0

    :goto_6
    invoke-direct {v0, v3, v4}, Ljava/io/SequenceInputStream;-><init>(Ljava/io/InputStream;Ljava/io/InputStream;)V

    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v0, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_7
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-static {v0, v10, v15}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-static {v10, v0}, Lq3/l;->h3(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lq3/l;->t3(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/shungo/app/InjectorService;->n:Ljava/lang/String;

    const/4 v15, 0x0

    goto :goto_b

    :cond_15
    const-string v4, "[GAME]"

    invoke-static {v0, v4, v15}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const-string v12, "injector exited with code "

    if-nez v4, :cond_17

    :try_start_2
    invoke-static {v0, v12, v15}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_16

    goto :goto_8

    :cond_16
    move v4, v15

    const/4 v15, 0x0

    goto :goto_a

    :cond_17
    :goto_8
    iget-object v4, v2, Lcom/shungo/app/InjectorService;->n:Ljava/lang/String;

    if-nez v4, :cond_18

    const/4 v15, 0x0

    goto :goto_9

    :cond_18
    const/4 v13, 0x0

    iput-object v13, v2, Lcom/shungo/app/InjectorService;->n:Ljava/lang/String;

    const-string v13, " </dev/null >/dev/null 2>&1 &"

    invoke-virtual {v4, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v4

    sget-object v13, Ly2/q;->b:Lj/a;

    new-instance v14, Ly2/f;

    const/4 v15, 0x0

    invoke-direct {v14, v4, v13, v15}, Ly2/f;-><init>(Ly2/g;Ljava/util/concurrent/Executor;Ly2/f;)V

    invoke-static {v15, v14}, Ly2/d;->b(Lj/a;Lx2/b;)V

    :goto_9
    const/4 v4, 0x0

    :goto_a
    invoke-static {v0, v12, v4}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-static {v12, v0}, Lq3/l;->h3(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lq3/l;->t3(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "[GAME]{\"method\":\"status\",\"payload\":{\"status\":\"Injector stopped (code "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")\"}}"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/shungo/app/InjectorService;->c(Ljava/lang/String;)V

    :cond_19
    invoke-virtual {v2, v0}, Lcom/shungo/app/InjectorService;->c(Ljava/lang/String;)V

    :goto_b
    const/4 v15, 0x0

    goto/16 :goto_7

    :cond_1a
    const/4 v15, 0x0

    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    iget-object v0, v2, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    :cond_1b
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->l:Ljava/lang/Process;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Process;->destroyForcibly()Ljava/lang/Process;

    :cond_1c
    iget-object v0, v2, Lcom/shungo/app/InjectorService;->l:Ljava/lang/Process;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_c

    :cond_1d
    move-object v12, v15

    :goto_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "binary stopped with exitCode "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-boolean v0, v2, Lcom/shungo/app/InjectorService;->j:Z

    if-eqz v0, :cond_1e

    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/shungo/app/InjectorService;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_1e
    const/4 v0, 0x0

    iput-boolean v0, v2, Lcom/shungo/app/InjectorService;->j:Z
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_3
    :goto_d
    move-object/from16 v3, v17

    move-object/from16 v4, v18

    goto/16 :goto_0

    :goto_e
    const-string v3, "Injector"

    const-string v4, "Injector Thread"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_d

    :cond_1f
    return-void
.end method
