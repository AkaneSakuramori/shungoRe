.class public final Lk1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/f;


# static fields
.field public static final d:Lt3/u;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lm2/m;

.field public final c:Lt3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lt3/u;->c:Ljava/util/regex/Pattern;

    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lf2/e;->r(Ljava/lang/String;)Lt3/u;

    move-result-object v0

    sput-object v0, Lk1/a;->d:Lt3/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget-object v0, La3/q;->b:La3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk1/a;->a:Ljava/util/Map;

    sget-object v0, Lcom/auth0/android/request/internal/f;->a:Lm2/m;

    iput-object v0, p0, Lk1/a;->b:Lm2/m;

    new-instance v0, Lt3/v;

    invoke-direct {v0}, Lt3/v;-><init>()V

    const/16 v1, 0xa

    int-to-long v2, v1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v5, "unit"

    invoke-static {v4, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3, v4}, Lu3/b;->b(JLjava/util/concurrent/TimeUnit;)I

    move-result v2

    iput v2, v0, Lt3/v;->r:I

    int-to-long v1, v1

    invoke-static {v1, v2, v4}, Lu3/b;->b(JLjava/util/concurrent/TimeUnit;)I

    move-result v1

    iput v1, v0, Lt3/v;->s:I

    new-instance v1, Lt3/w;

    invoke-direct {v1, v0}, Lt3/w;-><init>(Lt3/v;)V

    iput-object v1, p0, Lk1/a;->c:Lt3/w;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Le/c;)Lk1/g;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "url"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "options"

    invoke-static {v1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lt3/s;->j:[C

    invoke-static/range {p1 .. p1}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v2

    new-instance v3, Lt3/y;

    invoke-direct {v3}, Lt3/y;-><init>()V

    invoke-virtual {v2}, Lt3/s;->f()Lt3/r;

    move-result-object v2

    iget-object v4, v1, Le/c;->c:Ljava/lang/Object;

    check-cast v4, Lk1/d;

    instance-of v4, v4, Lk1/c;

    if-eqz v4, :cond_4

    iget-object v4, v1, Le/c;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    instance-of v7, v7, Ljava/lang/String;

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v6, v7}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/String;

    const-string v7, "name"

    invoke-static {v8, v7}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Lt3/r;->g:Ljava/util/ArrayList;

    if-nez v7, :cond_2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v2, Lt3/r;->g:Ljava/util/ArrayList;

    :cond_2
    iget-object v7, v2, Lt3/r;->g:Ljava/util/ArrayList;

    invoke-static {v7}, Lc3/h;->X(Ljava/lang/Object;)V

    sget-object v9, Lt3/s;->j:[C

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0xdb

    invoke-static/range {v8 .. v16}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v7, v2, Lt3/r;->g:Ljava/util/ArrayList;

    invoke-static {v7}, Lc3/h;->X(Ljava/lang/Object;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0xdb

    move-object v9, v6

    invoke-static/range {v9 .. v17}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v4, v1, Le/c;->c:Ljava/lang/Object;

    check-cast v4, Lk1/d;

    invoke-virtual {v4}, Lk1/d;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    goto :goto_2

    :cond_4
    iget-object v4, v1, Le/c;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v5, v0, Lk1/a;->b:Lm2/m;

    invoke-virtual {v5, v4}, Lm2/m;->f(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "gson.toJson(options.parameters)"

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lk1/a;->d:Lt3/u;

    invoke-static {v4, v5}, Lf2/e;->h(Ljava/lang/String;Lt3/u;)Lt3/z;

    move-result-object v4

    iget-object v5, v1, Le/c;->c:Ljava/lang/Object;

    check-cast v5, Lk1/d;

    invoke-virtual {v5}, Lk1/d;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    :goto_2
    iget-object v1, v1, Le/c;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v4, "<this>"

    iget-object v5, v0, Lk1/a;->a:Ljava/util/Map;

    invoke-static {v5, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "map"

    invoke-static {v1, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v5, 0x2

    mul-int/2addr v1, v5

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    move v7, v6

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v9}, Lq3/l;->t3(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8}, Lq3/l;->t3(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9}, Lf2/e;->f(Ljava/lang/String;)V

    invoke-static {v8, v9}, Lf2/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v9, v1, v7

    add-int/lit8 v9, v7, 0x1

    aput-object v8, v1, v9

    add-int/2addr v7, v5

    goto :goto_3

    :cond_5
    new-instance v4, Lt3/q;

    invoke-direct {v4, v1}, Lt3/q;-><init>([Ljava/lang/String;)V

    invoke-virtual {v2}, Lt3/r;->b()Lt3/s;

    move-result-object v1

    iput-object v1, v3, Lt3/y;->a:Lt3/s;

    invoke-virtual {v4}, Lt3/q;->c()Lt3/p;

    move-result-object v1

    iput-object v1, v3, Lt3/y;->c:Lt3/p;

    invoke-virtual {v3}, Lt3/y;->b()Li/w;

    move-result-object v1

    iget-object v2, v0, Lk1/a;->c:Lt3/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lx3/j;

    invoke-direct {v3, v2, v1, v6}, Lx3/j;-><init>(Lt3/w;Li/w;Z)V

    invoke-virtual {v3}, Lx3/j;->e()Lt3/b0;

    move-result-object v1

    new-instance v2, Lk1/g;

    iget-object v3, v1, Lt3/b0;->h:Lt3/d0;

    invoke-static {v3}, Lc3/h;->X(Ljava/lang/Object;)V

    check-cast v3, Lt3/c0;

    iget-object v3, v3, Lt3/c0;->d:Lf4/i;

    invoke-interface {v3}, Lf4/i;->A()Lf4/f;

    move-result-object v3

    iget-object v4, v1, Lt3/b0;->g:Lt3/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Ljava/util/TreeMap;

    sget-object v8, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    const-string v9, "CASE_INSENSITIVE_ORDER"

    invoke-static {v8, v9}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    invoke-virtual {v4}, Lt3/q;->size()I

    move-result v8

    :goto_4
    if-ge v6, v8, :cond_7

    invoke-virtual {v4, v6}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "US"

    invoke-static {v10, v11}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v9, v10}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    if-nez v10, :cond_6

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7, v9, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {v4, v6}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    iget v1, v1, Lt3/b0;->e:I

    invoke-direct {v2, v1, v3, v7}, Lk1/g;-><init>(ILjava/io/InputStream;Ljava/util/TreeMap;)V

    return-object v2
.end method
