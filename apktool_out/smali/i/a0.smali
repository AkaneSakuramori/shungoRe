.class public final Li/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/d;
.implements Li0/s;
.implements Lo2/n;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Li/a0;->b:I

    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Li/a0;->b:I

    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    const/4 p1, 0x3

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Li/a0;->b:I

    .line 22
    invoke-static {p1}, Li0/x;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object v0

    iput-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    .line 23
    invoke-static {p1}, Li0/x;->u(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object p1

    iput-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li/a0;->b:I

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    .line 6
    new-instance v1, Lr0/b;

    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const v2, 0x7fffffff

    iput v2, v1, Lr0/b;->a:I

    iput v0, v1, Lr0/b;->b:I

    if-eqz p1, :cond_0

    .line 8
    new-instance v0, Lr0/a;

    invoke-direct {v0, p1}, Lr0/a;-><init>(Landroid/widget/EditText;)V

    iput-object v0, v1, Lr0/b;->c:Ljava/lang/Object;

    iput-object v1, p0, Li/a0;->d:Ljava/lang/Object;

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "editText cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Li/a0;->b:I

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/i0;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Li/a0;->b:I

    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    iput-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Li/a0;->b:I

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    iput-object p3, p0, Li/a0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Li/a0;->b:I

    iput-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    iput-object p2, p0, Li/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Li/a0;->b:I

    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 16
    new-array v1, v0, [I

    iput-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    .line 17
    new-array v1, v0, [F

    iput-object v1, p0, Li/a0;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v2, [I

    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    iget-object v2, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v2, [F

    .line 19
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe

    iput v0, p0, Li/a0;->b:I

    .line 13
    sget-object v0, Lr2/b;->a:Lr2/b;

    iput-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt1/e;Lt1/e;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    iput v0, p0, Li/a0;->b:I

    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iput-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    iput-object p2, p0, Li/a0;->d:Ljava/lang/Object;

    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->a(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v1, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->b(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final c(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->c(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Li/a0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Type;

    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    const-string v2, "Invalid EnumSet type: "

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lm2/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/reflect/Type;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lm2/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/reflect/Type;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, " with no args"

    const-string v1, "Failed to invoke "

    :try_start_0
    iget-object v2, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/reflect/Constructor;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    goto :goto_2

    :goto_0
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :goto_1
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_2
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    return-void
.end method

.method public final f(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->f(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final g(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->g(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final h(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->h(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final i(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v1, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->i(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final j(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->j(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final k(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->k(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final l(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->l(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final m(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->m(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final n(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->n(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final o(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->o(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final p(Z)V
    .locals 2

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->j()Landroidx/fragment/app/i0;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-virtual {v0, v1}, Li/a0;->p(Z)V

    :cond_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public final q(Landroid/view/View;Li0/c2;)Li0/c2;
    .locals 12

    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ly/k;

    new-instance v1, Ly0/k0;

    iget-object v2, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v2, Ly0/k0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v3, v2, Ly0/k0;->a:I

    iput v3, v1, Ly0/k0;->a:I

    iget v3, v2, Ly0/k0;->b:I

    iput v3, v1, Ly0/k0;->b:I

    iget v3, v2, Ly0/k0;->c:I

    iput v3, v1, Ly0/k0;->c:I

    iget v2, v2, Ly0/k0;->d:I

    iput v2, v1, Ly0/k0;->d:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p2, Li0/c2;->a:Li0/a2;

    const/4 v3, 0x7

    invoke-virtual {v2, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v3

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Li0/a2;->f(I)Lb0/c;

    move-result-object v2

    iget-object v4, v0, Ly/k;->b:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v5, v3, Lb0/c;->b:I

    iput v5, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-static {p1}, Lc3/h;->q1(Landroid/view/View;)Z

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    iget-boolean v9, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v9, :cond_0

    invoke-virtual {p2}, Li0/c2;->a()I

    move-result v6

    iput v6, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    iget v9, v1, Ly0/k0;->d:I

    add-int/2addr v6, v9

    :cond_0
    iget-boolean v9, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    iget v10, v3, Lb0/c;->a:I

    if-eqz v9, :cond_2

    if-eqz v5, :cond_1

    iget v7, v1, Ly0/k0;->c:I

    goto :goto_0

    :cond_1
    iget v7, v1, Ly0/k0;->a:I

    :goto_0
    add-int/2addr v7, v10

    :cond_2
    iget-boolean v9, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    iget v11, v3, Lb0/c;->c:I

    if-eqz v9, :cond_4

    if-eqz v5, :cond_3

    iget v1, v1, Ly0/k0;->a:I

    goto :goto_1

    :cond_3
    iget v1, v1, Ly0/k0;->c:I

    :goto_1
    add-int v8, v1, v11

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v5, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    const/4 v9, 0x1

    if-eqz v5, :cond_5

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v5, v10, :cond_5

    iput v10, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v5, v9

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    iget-boolean v10, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v10, :cond_6

    iget v10, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v10, v11, :cond_6

    iput v11, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3

    :cond_6
    move v9, v5

    :goto_3
    iget-boolean v5, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v5, :cond_7

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, v3, Lb0/c;->b:I

    if-eq v5, v3, :cond_7

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_4

    :cond_7
    if-eqz v9, :cond_8

    :goto_4
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1, v7, v1, v8, v6}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean p1, v0, Ly/k;->a:Z

    if-eqz p1, :cond_9

    iget v0, v2, Lb0/c;->d:I

    iput v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_9
    iget-boolean v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-nez v0, :cond_a

    if-eqz p1, :cond_b

    :cond_a
    invoke-virtual {v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()V

    :cond_b
    return-object p2
.end method

.method public final r(Lcom/google/gson/reflect/TypeToken;)Lo2/n;
    .locals 11

    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    iget-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La;->n(Ljava/lang/Object;)V

    iget-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La;->n(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v4, Lr2/b;

    invoke-virtual {v4, v3}, Lr2/b;->a(Ljava/lang/reflect/AccessibleObject;)V

    :cond_0
    new-instance v4, Li/a0;

    const/16 v5, 0xc

    invoke-direct {v4, p0, v3, v5}, Li/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v4, v1

    :goto_0
    if-eqz v4, :cond_1

    return-object v4

    :cond_1
    const-class v3, Ljava/util/Collection;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_6

    const-class v3, Ljava/util/SortedSet;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, La4/x;

    const/4 v6, 0x4

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto/16 :goto_1

    :cond_2
    const-class v3, Ljava/util/EnumSet;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Li/a0;

    const/16 v6, 0xd

    invoke-direct {v3, p0, v0, v6}, Li/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_3
    const-class v3, Ljava/util/Set;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, La4/x;

    const/4 v6, 0x5

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto/16 :goto_1

    :cond_4
    const-class v3, Ljava/util/Queue;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, La4/x;

    const/4 v6, 0x6

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_5
    new-instance v3, La4/x;

    const/4 v6, 0x7

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_6
    const-class v3, Ljava/util/Map;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-class v3, Ljava/util/concurrent/ConcurrentNavigableMap;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v3, La4/x;

    const/16 v6, 0x8

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_7
    const-class v3, Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v3, La4/x;

    invoke-direct {v3, v2}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_8
    const-class v3, Ljava/util/SortedMap;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v3, La4/x;

    invoke-direct {v3, v5}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_9
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_a

    move-object v3, v0

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v3

    const-class v6, Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_a

    new-instance v3, La4/x;

    invoke-direct {v3, v4}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_a
    new-instance v3, La4/x;

    const/4 v6, 0x3

    invoke-direct {v3, v6}, La4/x;-><init>(I)V

    goto :goto_1

    :cond_b
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_c

    return-object v3

    :cond_c
    new-instance v3, Lg/h;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object p0, v3, Lg/h;->e:Ljava/lang/Object;

    iput-object p1, v3, Lg/h;->b:Ljava/lang/Object;

    iput-object v0, v3, Lg/h;->d:Ljava/lang/Object;

    const-string p1, "newInstance"

    const-class v0, Ljava/io/ObjectStreamClass;

    const-class v6, Ljava/lang/Class;

    :try_start_1
    const-string v7, "sun.misc.Unsafe"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const-string v8, "theUnsafe"

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "allocateInstance"

    new-array v10, v5, [Ljava/lang/Class;

    aput-object v6, v10, v2

    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    new-instance v9, Lo2/p;

    invoke-direct {v9, v7, v8}, Lo2/p;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    :try_start_2
    const-string v7, "getConstructorId"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v6, v8, v2

    invoke-virtual {v0, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v8, v5, [Ljava/lang/Object;

    const-class v9, Ljava/lang/Object;

    aput-object v9, v8, v2

    invoke-virtual {v7, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-array v7, v4, [Ljava/lang/Class;

    aput-object v6, v7, v2

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v5

    invoke-virtual {v0, p1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v9, Lo2/q;

    invoke-direct {v9, v1, v0}, Lo2/q;-><init>(ILjava/lang/reflect/Method;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    :try_start_3
    const-class v0, Ljava/io/ObjectInputStream;

    new-array v1, v4, [Ljava/lang/Class;

    aput-object v6, v1, v2

    aput-object v6, v1, v5

    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v9, Lo2/r;

    invoke-direct {v9, p1}, Lo2/r;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    new-instance v9, Lc1/j;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    :goto_2
    iput-object v9, v3, Lg/h;->c:Ljava/lang/Object;

    return-object v3
.end method

.method public final s(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Lr0/b;

    iget-object v0, v0, Lr0/b;->c:Ljava/lang/Object;

    check-cast v0, Lf2/e;

    invoke-virtual {v0, p1}, Lf2/e;->v(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final t(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ld/a;->i:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast p1, Lr0/b;

    iget-object p1, p1, Lr0/b;->c:Ljava/lang/Object;

    check-cast p1, Lf2/e;

    invoke-virtual {p1, v1}, Lf2/e;->O(Z)V

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Li/a0;->b:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Lb0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v1, Lb0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public final u(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    iget-object v0, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v0, Lr0/b;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lr0/b;->c:Ljava/lang/Object;

    check-cast v0, Lf2/e;

    invoke-virtual {v0, p1, p2}, Lf2/e;->G(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final v(Lf0/f;)V
    .locals 4

    iget v0, p1, Lf0/f;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Le/n0;

    iget-object v1, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    new-instance v2, Lf0/a;

    const/4 v3, 0x0

    iget-object p1, p1, Lf0/f;->a:Landroid/graphics/Typeface;

    invoke-direct {v2, p0, v0, p1, v3}, Lf0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li/a0;->c:Ljava/lang/Object;

    check-cast p1, Le/n0;

    iget-object v1, p0, Li/a0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    new-instance v2, Landroidx/activity/h;

    const/4 v3, 0x4

    invoke-direct {v2, p0, p1, v0, v3}, Landroidx/activity/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
