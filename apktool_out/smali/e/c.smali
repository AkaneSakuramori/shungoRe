.class public final Le/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/k;
.implements Ll0/d;


# static fields
.field public static f:Le/c;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Le/c;->b:I

    iput-object p1, p0, Le/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Le/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Le/c;->b:I

    .line 15
    new-instance v0, Le/p0;

    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/c;->e:Ljava/lang/Object;

    iput-object p1, p0, Le/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Le/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/q0;La4/x;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Le/c;->b:I

    .line 8
    sget-object v0, Lu0/a;->b:Lu0/a;

    .line 9
    invoke-direct {p0, p1, p2, v0}, Le/c;-><init>(Landroidx/lifecycle/q0;Landroidx/lifecycle/p0;Lu0/b;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/q0;La4/x;I)V
    .locals 0

    const/4 p3, 0x7

    iput p3, p0, Le/c;->b:I

    const-string p3, "store"

    .line 1
    invoke-static {p1, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "factory"

    invoke-static {p2, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Le/c;-><init>(Landroidx/lifecycle/q0;La4/x;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/q0;Landroidx/lifecycle/p0;Lu0/b;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x7

    iput v0, p0, Le/c;->b:I

    const-string v0, "store"

    .line 7
    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Le/c;->d:Ljava/lang/Object;

    iput-object p3, p0, Le/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/r0;Lu0/c;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Le/c;->b:I

    .line 20
    invoke-interface {p1}, Landroidx/lifecycle/r0;->h()Landroidx/lifecycle/q0;

    move-result-object v0

    .line 21
    instance-of v1, p1, Landroidx/lifecycle/h;

    if-eqz v1, :cond_0

    .line 22
    check-cast p1, Landroidx/lifecycle/h;

    invoke-interface {p1}, Landroidx/lifecycle/h;->a()Lu0/b;

    move-result-object p1

    goto :goto_0

    .line 23
    :cond_0
    sget-object p1, Lu0/a;->b:Lu0/a;

    .line 24
    :goto_0
    invoke-direct {p0, v0, p2, p1}, Le/c;-><init>(Landroidx/lifecycle/q0;Landroidx/lifecycle/p0;Lu0/b;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Le/c;->b:I

    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Le/c;->d:Ljava/lang/Object;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/c;->e:Ljava/lang/Object;

    iput-object p1, p0, Le/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk1/d;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Le/c;->b:I

    iput-object p1, p0, Le/c;->c:Ljava/lang/Object;

    .line 3
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Le/c;->d:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Le/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp/g;Lp/g;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Le/c;->b:I

    iput-object p1, p0, Le/c;->e:Ljava/lang/Object;

    iput-object p2, p0, Le/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr/e;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Le/c;->b:I

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/c;->c:Ljava/lang/Object;

    .line 19
    new-instance v0, Ls/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/c;->d:Ljava/lang/Object;

    iput-object p1, p0, Le/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public static u(Landroid/content/Context;Landroid/util/AttributeSet;[II)Le/c;
    .locals 2

    new-instance v0, Le/c;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/n0;
    .locals 3

    const-string v0, "key"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Landroidx/lifecycle/q0;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/n0;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v0, p1}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Lu0/d;

    iget-object v1, p0, Le/c;->e:Ljava/lang/Object;

    check-cast v1, Lu0/b;

    invoke-direct {v0, v1}, Lu0/d;-><init>(Lu0/b;)V

    sget-object v1, Landroidx/lifecycle/o0;->b:Landroidx/lifecycle/o0;

    iget-object v2, v0, Lu0/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v1, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/p0;

    invoke-interface {v1, p1, v0}, Landroidx/lifecycle/p0;->b(Ljava/lang/Class;Lu0/d;)Landroidx/lifecycle/n0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/p0;

    invoke-interface {v0, p1}, Landroidx/lifecycle/p0;->a(Ljava/lang/Class;)Landroidx/lifecycle/n0;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "viewModel"

    invoke-static {p1, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/lifecycle/q0;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/n0;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroidx/lifecycle/n0;->a()V

    :cond_1
    return-object p1
.end method

.method public final b(IZ)Z
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    return p1
.end method

.method public final c(I)Landroid/content/res/ColorStateList;
    .locals 2

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1, v0}, Lz/d;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public final d(II)I
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    return p1
.end method

.method public final e(II)I
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    return p1
.end method

.method public final f()Landroid/content/ClipDescription;
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/ClipDescription;

    return-object v0
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final h(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Le/c;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v0}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final i(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Li/x;->a()Li/x;

    move-result-object v0

    iget-object v1, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Li/x;->a:Li/u2;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Li/u2;->f(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final j(IILi/y0;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 p1, 0x0

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Le/c;->e:Ljava/lang/Object;

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Le/c;->e:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Le/c;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/util/TypedValue;

    sget-object v0, La0/q;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v7, 0x1

    const/4 v8, 0x0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, La0/q;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILc3/h;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final k(II)I
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    return p1
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Le/c;->e:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method public final m(Ljava/lang/String;)Landroid/location/Location;
    .locals 2

    :try_start_0
    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "TwilightManager"

    const-string v1, "Failed to get last known location"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final n(II)I
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    return p1
.end method

.method public final o(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final q(I)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final r(I)Z
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    return p1
.end method

.method public final s()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method public final t(ILr/d;Ls/n;)Z
    .locals 6

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Ls/b;

    iget-object v1, p2, Lr/d;->p0:[I

    const/4 v2, 0x0

    aget v3, v1, v2

    iput v3, v0, Ls/b;->a:I

    const/4 v3, 0x1

    aget v1, v1, v3

    iput v1, v0, Ls/b;->b:I

    invoke-virtual {p2}, Lr/d;->r()I

    move-result v1

    iput v1, v0, Ls/b;->c:I

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Ls/b;

    invoke-virtual {p2}, Lr/d;->l()I

    move-result v1

    iput v1, v0, Ls/b;->d:I

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Ls/b;

    iput-boolean v2, v0, Ls/b;->i:Z

    iput p1, v0, Ls/b;->j:I

    iget p1, v0, Ls/b;->a:I

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget v4, v0, Ls/b;->b:I

    if-ne v4, v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    const/4 v4, 0x0

    if-eqz p1, :cond_2

    iget p1, p2, Lr/d;->W:F

    cmpl-float p1, p1, v4

    if-lez p1, :cond_2

    move p1, v3

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    if-eqz v1, :cond_3

    iget v1, p2, Lr/d;->W:F

    cmpl-float v1, v1, v4

    if-lez v1, :cond_3

    move v1, v3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    iget-object v4, p2, Lr/d;->t:[I

    const/4 v5, 0x4

    if-eqz p1, :cond_4

    aget p1, v4, v2

    if-ne p1, v5, :cond_4

    iput v3, v0, Ls/b;->a:I

    :cond_4
    if-eqz v1, :cond_5

    aget p1, v4, v3

    if-ne p1, v5, :cond_5

    iput v3, v0, Ls/b;->b:I

    :cond_5
    invoke-virtual {p3, p2, v0}, Ls/n;->b(Lr/d;Ls/b;)V

    iget-object p1, p0, Le/c;->d:Ljava/lang/Object;

    check-cast p1, Ls/b;

    iget p1, p1, Ls/b;->e:I

    invoke-virtual {p2, p1}, Lr/d;->P(I)V

    iget-object p1, p0, Le/c;->d:Ljava/lang/Object;

    check-cast p1, Ls/b;

    iget p1, p1, Ls/b;->f:I

    invoke-virtual {p2, p1}, Lr/d;->M(I)V

    iget-object p1, p0, Le/c;->d:Ljava/lang/Object;

    check-cast p1, Ls/b;

    iget-boolean p3, p1, Ls/b;->h:Z

    iput-boolean p3, p2, Lr/d;->E:Z

    iget p1, p1, Ls/b;->g:I

    invoke-virtual {p2, p1}, Lr/d;->J(I)V

    iget-object p1, p0, Le/c;->d:Ljava/lang/Object;

    check-cast p1, Ls/b;

    iput v2, p1, Ls/b;->j:I

    iget-boolean p1, p1, Ls/b;->i:Z

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Le/c;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v0, Lp/i;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v1, Lp/i;

    iget-object v1, v1, Lp/i;->i:[F

    aget v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v1, Lp/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Le/c;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final w(Lr/e;III)V
    .locals 3

    iget v0, p1, Lr/d;->b0:I

    iget v1, p1, Lr/d;->c0:I

    const/4 v2, 0x0

    iput v2, p1, Lr/d;->b0:I

    iput v2, p1, Lr/d;->c0:I

    invoke-virtual {p1, p3}, Lr/d;->P(I)V

    invoke-virtual {p1, p4}, Lr/d;->M(I)V

    if-gez v0, :cond_0

    iput v2, p1, Lr/d;->b0:I

    goto :goto_0

    :cond_0
    iput v0, p1, Lr/d;->b0:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Lr/d;->c0:I

    goto :goto_1

    :cond_1
    iput v1, p1, Lr/d;->c0:I

    :goto_1
    iget-object p1, p0, Le/c;->e:Ljava/lang/Object;

    check-cast p1, Lr/e;

    iput p2, p1, Lr/e;->t0:I

    invoke-virtual {p1}, Lr/e;->S()V

    return-void
.end method

.method public final x(Lr/e;)V
    .locals 8

    iget-object v0, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_2

    iget-object v4, p1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr/d;

    iget-object v5, v4, Lr/d;->p0:[I

    aget v6, v5, v1

    const/4 v7, 0x3

    if-eq v6, v7, :cond_0

    aget v3, v5, v3

    if-ne v3, v7, :cond_1

    :cond_0
    iget-object v3, p0, Le/c;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lr/e;->s0:Ls/e;

    iput-boolean v3, p1, Ls/e;->b:Z

    return-void
.end method
