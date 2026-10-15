.class public final Lv2/b;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public f:Landroid/content/SharedPreferences;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lv2/b;->k:Landroid/content/Context;

    iput-object p2, p0, Lv2/b;->l:Landroid/os/Handler;

    invoke-direct {p0, p3}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 3

    new-instance v0, Lv2/b;

    iget-object v1, p0, Lv2/b;->k:Landroid/content/Context;

    iget-object v2, p0, Lv2/b;->l:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, p1}, Lv2/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lv2/b;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lv2/b;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lv2/b;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v7, p0

    const-string v8, "Error downloading injector response: "

    const-string v9, "Error response: "

    const-string v10, "Script fetch: "

    const-string v11, "&manufacturer="

    const-string v12, "injector check failed ("

    const-string v13, "Failed to download file: "

    const-string v14, "is 64 bits device: "

    const-string v1, "&injector="

    sget-object v15, Ld3/a;->b:Ld3/a;

    iget v0, v7, Lv2/b;->j:I

    iget-object v5, v7, Lv2/b;->k:Landroid/content/Context;

    const-string v4, "injectormd5"

    iget-object v2, v7, Lv2/b;->l:Landroid/os/Handler;

    const-string v6, "getString(...)"

    const-string v3, "Shungo"

    move-object/from16 v19, v8

    if-eqz v0, :cond_2

    const/4 v8, 0x1

    if-eq v0, v8, :cond_1

    const/4 v8, 0x2

    if-ne v0, v8, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lc3/h;->D2(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v0, p1

    move-object/from16 v26, v2

    move-object v14, v3

    move-object v11, v5

    move-object/from16 v16, v9

    const/16 v8, 0xc8

    goto/16 :goto_14

    :catch_0
    move-exception v0

    move-object v11, v5

    goto/16 :goto_16

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v8, 0x2

    iget v0, v7, Lv2/b;->i:I

    iget-object v1, v7, Lv2/b;->h:Ljava/lang/String;

    iget-object v8, v7, Lv2/b;->g:Ljava/lang/String;

    move/from16 v20, v0

    iget-object v0, v7, Lv2/b;->f:Landroid/content/SharedPreferences;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lc3/h;->D2(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move-object v3, v8

    move-object/from16 v16, v9

    const/16 v8, 0xc8

    const/16 v17, 0x1

    move-object v9, v0

    move-object v2, v1

    move/from16 v0, v20

    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_2
    invoke-static/range {p1 .. p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    :try_start_2
    const-string v0, "shungo"

    move-object/from16 v16, v9

    const/4 v8, 0x0

    invoke-virtual {v5, v0, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    if-eqz v9, :cond_3

    const-string v0, "settings"

    const/4 v8, 0x0

    invoke-interface {v9, v0, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    :try_start_3
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "other"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v8, "experimentalInjector"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    const/4 v0, 0x0

    :goto_3
    invoke-static {}, Lc3/h;->l1()Z

    move-result v8

    if-eqz v8, :cond_7

    if-eqz v0, :cond_6

    const-string v8, "experimental64bit"

    :goto_4
    move-object/from16 v21, v2

    goto :goto_5

    :cond_6
    const-string v8, "main64bit"

    goto :goto_4

    :cond_7
    if-eqz v0, :cond_8

    const-string v8, "experimental32bit"

    goto :goto_4

    :cond_8
    const-string v8, "main32bit"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_4

    :goto_5
    :try_start_5
    const-string v2, "none"

    invoke-interface {v9, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v22, Lw2/d;->a:Lt3/u;

    move-object/from16 v22, v3

    const v3, 0x7f0f0042

    invoke-virtual {v5, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&md5="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v24, 0x0

    const/16 v25, 0x18

    iput-object v9, v7, Lv2/b;->f:Landroid/content/SharedPreferences;

    iput-object v8, v7, Lv2/b;->g:Ljava/lang/String;

    iput-object v2, v7, Lv2/b;->h:Ljava/lang/String;

    iput v0, v7, Lv2/b;->i:I

    const/4 v1, 0x1

    iput v1, v7, Lv2/b;->j:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    move/from16 v18, v1

    move-object v1, v5

    move-object/from16 v26, v21

    move-object/from16 v21, v2

    move-object v2, v3

    move/from16 v17, v18

    move-object/from16 v27, v22

    move-object v3, v4

    move-object/from16 v28, v23

    move-object/from16 v4, v24

    move-object/from16 v29, v5

    move-object/from16 v5, p0

    move-object/from16 v30, v6

    move-object/from16 v18, v8

    const/16 v8, 0xc8

    move/from16 v6, v25

    :try_start_6
    invoke-static/range {v1 .. v6}, Lw2/d;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc3/e;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_9

    return-object v15

    :cond_9
    move-object/from16 v3, v18

    move-object/from16 v2, v21

    :goto_6
    check-cast v1, Lw2/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lc3/h;->l1()Z

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " - using experimental: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_a

    move/from16 v6, v17

    goto :goto_7

    :cond_a
    const/4 v6, 0x0

    :goto_7
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", using: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", current injector: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - injector req "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_b

    iget v0, v1, Lw2/a;->b:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_9

    :goto_8
    move-object/from16 v2, v26

    move-object/from16 v11, v29

    goto/16 :goto_16

    :cond_b
    const/4 v2, 0x0

    :goto_9
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, v27

    invoke-static {v14, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_d

    iget v0, v1, Lw2/a;->b:I

    if-ne v0, v8, :cond_c

    move-object v0, v1

    goto :goto_a

    :cond_c
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_d

    iget-object v0, v0, Lw2/a;->a:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    if-eqz v0, :cond_d

    :try_start_7
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_b

    :catch_2
    :cond_d
    const/4 v2, 0x0

    :goto_b
    if-eqz v2, :cond_e

    :try_start_8
    const-string v0, "needUpdate"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_c

    :catch_3
    move-exception v0

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    :goto_c
    const-string v0, "injector"

    if-eqz v2, :cond_12

    if-eqz v6, :cond_12

    :try_start_9
    const-string v1, "downloading newest injector"

    invoke-static {v14, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lt3/w;

    new-instance v3, Lt3/v;

    invoke-direct {v3}, Lt3/v;-><init>()V

    invoke-direct {v1, v3}, Lt3/w;-><init>(Lt3/v;)V

    new-instance v3, Lt3/y;

    invoke-direct {v3}, Lt3/y;-><init>()V

    const-string v4, "url"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v30

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lt3/y;->e(Ljava/lang/String;)V

    invoke-virtual {v3}, Lt3/y;->b()Li/w;

    move-result-object v3

    new-instance v4, Lx3/j;

    const/4 v6, 0x0

    invoke-direct {v4, v1, v3, v6}, Lx3/j;-><init>(Lt3/w;Li/w;Z)V

    invoke-virtual {v4}, Lx3/j;->e()Lt3/b0;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    iget v3, v1, Lt3/b0;->e:I

    if-gt v8, v3, :cond_11

    const/16 v4, 0x12c

    if-ge v3, v4, :cond_11

    :try_start_a
    iget-object v3, v1, Lt3/b0;->h:Lt3/d0;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-eqz v3, :cond_f

    move-object/from16 v6, v29

    :try_start_b
    invoke-static {v6, v3, v0}, Lc3/h;->p2(Landroid/content/Context;Lt3/d0;Ljava/lang/String;)V

    sget-object v0, Lz2/f;->a:Lz2/f;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_e

    :catchall_0
    move-exception v0

    :goto_d
    move-object v2, v0

    goto :goto_11

    :cond_f
    move-object/from16 v6, v29

    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_10

    const/4 v3, 0x0

    :try_start_c
    invoke-static {v1, v3}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "md5"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v28

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    goto/16 :goto_13

    :catch_4
    move-exception v0

    :goto_f
    move-object v11, v6

    :goto_10
    move-object/from16 v2, v26

    goto/16 :goto_16

    :cond_10
    :try_start_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Failed to download file: response body is null"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object/from16 v6, v29

    goto :goto_d

    :cond_11
    move-object/from16 v6, v29

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :goto_11
    :try_start_e
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_f
    invoke-static {v1, v2}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :catch_5
    move-exception v0

    move-object/from16 v6, v29

    goto :goto_f

    :cond_12
    move-object/from16 v6, v29

    move-object/from16 v5, v30

    if-eqz v2, :cond_13

    const-string v0, "injector is up to date"

    invoke-static {v14, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_13

    :cond_13
    new-instance v2, Ljava/io/File;

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v1, :cond_14

    iget v1, v1, Lw2/a;->b:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_12

    :cond_14
    const/4 v2, 0x0

    :goto_12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "), using cached injector"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_13
    sget-object v0, Lw2/d;->a:Lt3/u;

    const v0, 0x7f0f001c

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v9, 0x0

    iput-object v9, v7, Lv2/b;->f:Landroid/content/SharedPreferences;

    iput-object v9, v7, Lv2/b;->g:Ljava/lang/String;

    iput-object v9, v7, Lv2/b;->h:Ljava/lang/String;

    const/4 v1, 0x2

    iput v1, v7, Lv2/b;->j:I
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    move-object v1, v6

    move-object v11, v6

    move-object/from16 v6, p0

    :try_start_10
    invoke-static/range {v1 .. v6}, Lw2/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lc3/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_15

    return-object v15

    :cond_15
    :goto_14
    check-cast v0, Lw2/a;

    if-nez v0, :cond_16

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Lw2/a;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v1, v0, Lw2/a;->b:I

    if-ne v1, v8, :cond_17

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_17
    iget-object v0, v0, Lw2/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v2, v16

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Le/k0;

    const/16 v2, 0x8

    invoke-direct {v1, v11, v2, v0}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7

    move-object/from16 v2, v26

    :try_start_11
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :catch_6
    move-exception v0

    goto :goto_16

    :catch_7
    move-exception v0

    goto/16 :goto_10

    :cond_18
    move-object v11, v6

    move-object/from16 v2, v26

    const/4 v9, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v3, v19

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v1, :cond_19

    iget v3, v1, Lw2/a;->b:I

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v3}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_15

    :cond_19
    move-object v8, v9

    :goto_15
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Le/k0;

    const/4 v3, 0x7

    invoke-direct {v0, v11, v3, v1}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6

    return-object v0

    :catch_8
    move-exception v0

    move-object v11, v5

    move-object/from16 v2, v21

    :goto_16
    new-instance v1, Le/o;

    const/4 v3, 0x3

    invoke-direct {v1, v11, v3}, Le/o;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method
