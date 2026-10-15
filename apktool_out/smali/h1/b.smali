.class public final synthetic Lh1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lh1/c;

.field public final synthetic c:Li1/a;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lh1/c;Li1/a;)V
    .locals 1

    sget-object v0, La3/q;->b:La3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/b;->b:Lh1/c;

    iput-object p2, p0, Lh1/b;->c:Li1/a;

    const/4 p1, 0x0

    iput p1, p0, Lh1/b;->d:I

    const/4 p2, 0x0

    iput-object p2, p0, Lh1/b;->e:Ljava/lang/String;

    iput-boolean p1, p0, Lh1/b;->f:Z

    iput-object v0, p0, Lh1/b;->g:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 22

    move-object/from16 v1, p0

    iget-object v0, v1, Lh1/b;->b:Lh1/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lh1/b;->c:Li1/a;

    const-string v3, "$callback"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lh1/b;->g:Ljava/util/Map;

    const-string v4, "$parameters"

    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lh1/a;->b:Lh1/f;

    check-cast v4, Lh1/e;

    const-string v5, "com.auth0.access_token"

    invoke-virtual {v4, v5}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.auth0.refresh_token"

    invoke-virtual {v4, v6}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v6, "com.auth0.id_token"

    invoke-virtual {v4, v6}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "com.auth0.token_type"

    invoke-virtual {v4, v7}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v4, Lh1/e;->a:Landroid/content/SharedPreferences;

    const-string v9, "com.auth0.expires_at"

    invoke-interface {v8, v9}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v10

    const/4 v12, 0x0

    if-nez v10, :cond_0

    move-object v8, v12

    goto :goto_0

    :cond_0
    const-wide/16 v13, 0x0

    invoke-interface {v8, v9, v13, v14}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_0
    const-string v9, "com.auth0.scope"

    invoke-virtual {v4, v9}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    if-nez v8, :cond_3

    :cond_2
    new-instance v0, Lh1/d;

    const-string v3, "No Credentials were previously set."

    invoke-direct {v0, v3, v12}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v0}, Li1/a;->a(Lf1/b;)V

    goto/16 :goto_8

    :cond_3
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget v4, v1, Lh1/b;->d:I

    int-to-long v14, v4

    invoke-virtual {v0, v9, v10, v14, v15}, Lh1/a;->a(JJ)Z

    move-result v9

    iget-object v10, v1, Lh1/b;->e:Ljava/lang/String;

    const/16 v16, 0x1

    const-string v17, ""

    if-nez v10, :cond_4

    move/from16 v19, v4

    move-wide/from16 v20, v14

    const/4 v12, 0x0

    goto :goto_2

    :cond_4
    if-nez v13, :cond_5

    move-object/from16 v12, v17

    goto :goto_1

    :cond_5
    move-object v12, v13

    :goto_1
    const-string v18, " "

    move/from16 v19, v4

    filled-new-array/range {v18 .. v18}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v12, v4}, Lq3/l;->m3(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    move-wide/from16 v20, v14

    const/4 v12, 0x0

    new-array v14, v12, [Ljava/lang/String;

    invoke-interface {v4, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    filled-new-array/range {v18 .. v18}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lq3/l;->m3(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    new-array v15, v12, [Ljava/lang/String;

    invoke-interface {v14, v15}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/String;

    invoke-static {v12}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    invoke-static {v4, v12}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v12, v4, 0x1

    :goto_2
    iget-boolean v4, v1, Lh1/b;->f:Z

    if-nez v4, :cond_9

    if-nez v9, :cond_9

    if-nez v12, :cond_9

    if-nez v6, :cond_6

    move-object/from16 v6, v17

    :cond_6
    if-nez v5, :cond_7

    move-object/from16 v9, v17

    goto :goto_3

    :cond_7
    move-object v9, v5

    :goto_3
    if-nez v7, :cond_8

    move-object/from16 v10, v17

    goto :goto_4

    :cond_8
    move-object v10, v7

    :goto_4
    new-instance v12, Ljava/util/Date;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {v12, v3, v4}, Ljava/util/Date;-><init>(J)V

    new-instance v0, Lcom/auth0/android/result/Credentials;

    move-object v7, v0

    move-object v8, v6

    invoke-direct/range {v7 .. v13}, Lcom/auth0/android/result/Credentials;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Li1/a;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_9
    if-nez v11, :cond_a

    new-instance v0, Lh1/d;

    const-string v3, "Credentials need to be renewed but no Refresh Token is available to renew them."

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v0}, Li1/a;->a(Lf1/b;)V

    goto/16 :goto_8

    :cond_a
    iget-object v4, v0, Lh1/a;->a:Lg1/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v5, Lg1/d;->b:I

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Lg1/d;

    invoke-direct {v6, v5}, Lg1/d;-><init>(Ljava/util/Map;)V

    iget-object v5, v4, Lg1/b;->a:Lf1/a;

    iget-object v7, v5, Lf1/a;->a:Ljava/lang/String;

    const-string v8, "clientId"

    invoke-static {v7, v8}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "client_id"

    invoke-virtual {v6, v8, v7}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "refresh_token"

    invoke-virtual {v6, v7, v11}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "grant_type"

    invoke-virtual {v6, v8, v7}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v6, Lg1/d;->a:Ljava/util/LinkedHashMap;

    invoke-static {v6}, La3/j;->b3(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    sget-object v7, Lt3/s;->j:[C

    iget-object v5, v5, Lf1/a;->b:Lt3/s;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v5

    invoke-virtual {v5}, Lt3/s;->f()Lt3/r;

    move-result-object v5

    const-string v7, "oauth"

    invoke-virtual {v5, v7}, Lt3/r;->a(Ljava/lang/String;)V

    const-string v7, "token"

    invoke-virtual {v5, v7}, Lt3/r;->a(Ljava/lang/String;)V

    invoke-virtual {v5}, Lt3/r;->b()Lt3/s;

    move-result-object v5

    new-instance v7, Lcom/auth0/android/request/internal/e;

    const-class v8, Lcom/auth0/android/result/Credentials;

    iget-object v9, v4, Lg1/b;->c:Lm2/m;

    invoke-direct {v7, v8, v9}, Lcom/auth0/android/request/internal/e;-><init>(Ljava/lang/Class;Lm2/m;)V

    iget-object v4, v4, Lg1/b;->b:Lcom/auth0/android/request/internal/l;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "url"

    iget-object v5, v5, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v5, v8}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lk1/b;->c:Lk1/b;

    iget-object v9, v4, Lcom/auth0/android/request/internal/l;->b:Lg1/a;

    invoke-virtual {v4, v8, v5, v7, v9}, Lcom/auth0/android/request/internal/l;->a(Lk1/d;Ljava/lang/String;Lcom/auth0/android/request/internal/e;Lg1/a;)Lcom/auth0/android/request/internal/a;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/auth0/android/request/internal/a;->b(Ljava/util/Map;)V

    invoke-virtual {v4, v3}, Lcom/auth0/android/request/internal/a;->b(Ljava/util/Map;)V

    if-eqz v10, :cond_c

    const-string v3, "scope"

    invoke-static {v3, v3}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-static {v10}, Lc3/h;->i1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_b
    const-string v5, "value"

    invoke-static {v10, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v4, Lcom/auth0/android/request/internal/a;->f:Le/c;

    iget-object v5, v5, Le/c;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    :try_start_0
    invoke-virtual {v4}, Lcom/auth0/android/request/internal/a;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/auth0/android/result/Credentials;

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->b()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    move-wide/from16 v6, v20

    invoke-virtual {v0, v4, v5, v6, v7}, Lh1/a;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_d

    iget-object v0, v0, Lh1/a;->c:La4/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    move/from16 v0, v19

    mul-int/lit16 v3, v0, 0x3e8

    int-to-long v6, v3

    sub-long/2addr v4, v6

    const/16 v3, -0x3e8

    int-to-long v6, v3

    div-long/2addr v4, v6

    new-instance v3, Lh1/d;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v7, "The lifetime of the renewed Access Token (%d) is less than the minTTL requested (%d). Increase the \'Token Expiration\' setting of your Auth0 API in the dashboard, or request a lower minTTL."

    const/4 v8, 0x2

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v9, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v16

    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "format(locale, format, *args)"

    invoke-static {v0, v4}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v3}, Li1/a;->a(Lf1/b;)V

    goto :goto_8

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_d
    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_e

    :goto_5
    move-object v8, v11

    goto :goto_6

    :cond_e
    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->d()Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :goto_6
    new-instance v11, Lcom/auth0/android/result/Credentials;

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->b()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v3}, Lcom/auth0/android/result/Credentials;->e()Ljava/lang/String;

    move-result-object v10

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Lcom/auth0/android/result/Credentials;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lh1/c;->c(Lcom/auth0/android/result/Credentials;)V

    invoke-interface {v2, v11}, Li1/a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lg1/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :goto_7
    new-instance v3, Lh1/d;

    const-string v4, "An error occurred while trying to use the Refresh Token to renew the Credentials."

    invoke-direct {v3, v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v3}, Li1/a;->a(Lf1/b;)V

    :goto_8
    return-void
.end method
