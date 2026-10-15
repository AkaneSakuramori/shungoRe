.class public abstract Le/m;
.super Landroidx/fragment/app/u;
.source "SourceFile"

# interfaces
.implements Le/n;


# instance fields
.field public w:Le/e0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/u;-><init>()V

    iget-object v0, p0, Landroidx/activity/n;->f:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    new-instance v1, Le/k;

    invoke-direct {v1, p0}, Le/k;-><init>(Le/m;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Lz0/e;->b(Ljava/lang/String;Lz0/d;)V

    new-instance v0, Le/l;

    invoke-direct {v0, p0}, Le/l;-><init>(Le/m;)V

    invoke-virtual {p0, v0}, Landroidx/activity/n;->i(Lb/b;)V

    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Le/m;->m()V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->w()V

    iget-object v1, v0, Le/e0;->B:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, Le/e0;->n:Le/y;

    iget-object p2, v0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/y;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 11

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Le/e0;->P:Z

    iget v2, v0, Le/e0;->T:I

    const/16 v3, -0x64

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    sget v2, Le/r;->c:I

    :goto_0
    invoke-virtual {v0, p1, v2}, Le/e0;->C(Landroid/content/Context;I)I

    move-result v0

    invoke-static {p1}, Le/r;->c(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    invoke-static {p1}, Le/r;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_4

    :cond_1
    invoke-static {}, Le0/b;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-boolean v2, Le/r;->g:Z

    if-nez v2, :cond_7

    sget-object v2, Le/r;->b:Le/l0;

    new-instance v4, Le/o;

    invoke-direct {v4, p1, v3}, Le/o;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v4}, Le/l0;->execute(Ljava/lang/Runnable;)V

    goto :goto_4

    :cond_2
    sget-object v2, Le/r;->j:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v4, Le/r;->d:Le0/h;

    if-nez v4, :cond_5

    sget-object v4, Le/r;->e:Le0/h;

    if-nez v4, :cond_3

    invoke-static {p1}, Lr3/q;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Le0/h;->a(Ljava/lang/String;)Le0/h;

    move-result-object v4

    sput-object v4, Le/r;->e:Le0/h;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    sget-object v4, Le/r;->e:Le0/h;

    iget-object v4, v4, Le0/h;->a:Le0/i;

    check-cast v4, Le0/j;

    iget-object v4, v4, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    monitor-exit v2

    goto :goto_4

    :cond_4
    sget-object v4, Le/r;->e:Le0/h;

    sput-object v4, Le/r;->d:Le0/h;

    goto :goto_2

    :cond_5
    sget-object v5, Le/r;->e:Le0/h;

    invoke-virtual {v4, v5}, Le0/h;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    sget-object v4, Le/r;->d:Le0/h;

    sput-object v4, Le/r;->e:Le0/h;

    iget-object v4, v4, Le0/h;->a:Le0/i;

    check-cast v4, Le0/j;

    iget-object v4, v4, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lr3/q;->o(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_2
    monitor-exit v2

    goto :goto_4

    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_7
    :goto_4
    invoke-static {p1}, Le/e0;->p(Landroid/content/Context;)Le0/h;

    move-result-object v2

    sget-boolean v4, Le/e0;->l0:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v4, :cond_8

    invoke-static {p1, v0, v2, v5, v3}, Le/e0;->t(Landroid/content/Context;ILe0/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v4

    :try_start_1
    move-object v6, p1

    check-cast v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_b

    :catch_0
    :cond_8
    instance-of v4, p1, Lg/f;

    if-eqz v4, :cond_9

    invoke-static {p1, v0, v2, v5, v3}, Le/e0;->t(Landroid/content/Context;ILe0/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v4

    :try_start_2
    move-object v6, p1

    check-cast v6, Lg/f;

    invoke-virtual {v6, v4}, Lg/f;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_b

    :catch_1
    :cond_9
    sget-boolean v4, Le/e0;->k0:Z

    if-nez v4, :cond_a

    goto/16 :goto_b

    :cond_a
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v6, Landroid/content/res/Configuration;

    invoke-direct {v6}, Landroid/content/res/Configuration;-><init>()V

    const/4 v7, -0x1

    iput v7, v6, Landroid/content/res/Configuration;->uiMode:I

    const/4 v7, 0x0

    iput v7, v6, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {p1, v6}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget v9, v8, Landroid/content/res/Configuration;->uiMode:I

    iput v9, v6, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v6, v8}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v9

    if-nez v9, :cond_20

    new-instance v9, Landroid/content/res/Configuration;

    invoke-direct {v9}, Landroid/content/res/Configuration;-><init>()V

    iput v7, v9, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v6, v8}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_5

    :cond_b
    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    iget v10, v8, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v7, v7, v10

    if-eqz v7, :cond_c

    iput v10, v9, Landroid/content/res/Configuration;->fontScale:F

    :cond_c
    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    iget v10, v8, Landroid/content/res/Configuration;->mcc:I

    if-eq v7, v10, :cond_d

    iput v10, v9, Landroid/content/res/Configuration;->mcc:I

    :cond_d
    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    iget v10, v8, Landroid/content/res/Configuration;->mnc:I

    if-eq v7, v10, :cond_e

    iput v10, v9, Landroid/content/res/Configuration;->mnc:I

    :cond_e
    invoke-static {v6, v8, v9}, Le/w;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v7, v6, Landroid/content/res/Configuration;->touchscreen:I

    iget v10, v8, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v7, v10, :cond_f

    iput v10, v9, Landroid/content/res/Configuration;->touchscreen:I

    :cond_f
    iget v7, v6, Landroid/content/res/Configuration;->keyboard:I

    iget v10, v8, Landroid/content/res/Configuration;->keyboard:I

    if-eq v7, v10, :cond_10

    iput v10, v9, Landroid/content/res/Configuration;->keyboard:I

    :cond_10
    iget v7, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v10, v8, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v7, v10, :cond_11

    iput v10, v9, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_11
    iget v7, v6, Landroid/content/res/Configuration;->navigation:I

    iget v10, v8, Landroid/content/res/Configuration;->navigation:I

    if-eq v7, v10, :cond_12

    iput v10, v9, Landroid/content/res/Configuration;->navigation:I

    :cond_12
    iget v7, v6, Landroid/content/res/Configuration;->navigationHidden:I

    iget v10, v8, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v7, v10, :cond_13

    iput v10, v9, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_13
    iget v7, v6, Landroid/content/res/Configuration;->orientation:I

    iget v10, v8, Landroid/content/res/Configuration;->orientation:I

    if-eq v7, v10, :cond_14

    iput v10, v9, Landroid/content/res/Configuration;->orientation:I

    :cond_14
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0xf

    iget v10, v8, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v10, v10, 0xf

    if-eq v7, v10, :cond_15

    iget v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    :cond_15
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0xc0

    iget v10, v8, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v10, v10, 0xc0

    if-eq v7, v10, :cond_16

    iget v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    :cond_16
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0x30

    iget v10, v8, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v10, v10, 0x30

    if-eq v7, v10, :cond_17

    iget v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    :cond_17
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0x300

    iget v10, v8, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v10, v10, 0x300

    if-eq v7, v10, :cond_18

    iget v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->screenLayout:I

    :cond_18
    iget v7, v6, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v7, v7, 0x3

    iget v10, v8, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v10, v10, 0x3

    if-eq v7, v10, :cond_19

    iget v7, v9, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->colorMode:I

    :cond_19
    iget v7, v6, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v7, v7, 0xc

    iget v10, v8, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v10, v10, 0xc

    if-eq v7, v10, :cond_1a

    iget v7, v9, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->colorMode:I

    :cond_1a
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0xf

    iget v10, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v10, v10, 0xf

    if-eq v7, v10, :cond_1b

    iget v7, v9, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->uiMode:I

    :cond_1b
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0x30

    iget v10, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v10, v10, 0x30

    if-eq v7, v10, :cond_1c

    iget v7, v9, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v7, v10

    iput v7, v9, Landroid/content/res/Configuration;->uiMode:I

    :cond_1c
    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v10, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v7, v10, :cond_1d

    iput v10, v9, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_1d
    iget v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v10, v8, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v7, v10, :cond_1e

    iput v10, v9, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_1e
    iget v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v10, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v7, v10, :cond_1f

    iput v10, v9, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_1f
    iget v6, v6, Landroid/content/res/Configuration;->densityDpi:I

    iget v7, v8, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v6, v7, :cond_21

    iput v7, v9, Landroid/content/res/Configuration;->densityDpi:I

    goto :goto_5

    :cond_20
    move-object v9, v5

    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v9, v1}, Le/e0;->t(Landroid/content/Context;ILe0/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    new-instance v2, Lg/f;

    const v6, 0x7f100218

    invoke-direct {v2, p1, v6}, Lg/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v0}, Lg/f;->a(Landroid/content/res/Configuration;)V

    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    if-eqz p1, :cond_25

    invoke-virtual {v2}, Lg/f;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const/16 v0, 0x1d

    if-lt v4, v0, :cond_22

    invoke-static {p1}, La0/p;->a(Landroid/content/res/Resources$Theme;)V

    goto :goto_a

    :cond_22
    sget-object v0, La0/o;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    sget-boolean v4, La0/o;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v4, :cond_23

    :try_start_5
    const-class v4, Landroid/content/res/Resources$Theme;

    const-string v6, "rebase"

    new-array v7, v3, [Ljava/lang/Class;

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sput-object v4, La0/o;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_9

    :catch_2
    move-exception v4

    :try_start_6
    const-string v6, "ResourcesCompat"

    const-string v7, "Failed to retrieve rebase() method"

    invoke-static {v6, v7, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    sput-boolean v1, La0/o;->c:Z

    :cond_23
    sget-object v1, La0/o;->b:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_24

    :try_start_7
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    :catch_3
    move-exception p1

    goto :goto_7

    :catch_4
    move-exception p1

    :goto_7
    :try_start_8
    const-string v1, "ResourcesCompat"

    const-string v3, "Failed to invoke rebase() method via reflection"

    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sput-object v5, La0/o;->b:Ljava/lang/reflect/Method;

    :cond_24
    :goto_8
    monitor-exit v0

    goto :goto_a

    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw p1

    :catch_5
    :cond_25
    :goto_a
    move-object p1, v2

    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    invoke-super {p0, p1}, Ly/j;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->w()V

    iget-object v0, v0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    iget-object v1, v0, Le/e0;->q:Lg/l;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Le/e0;->A()V

    new-instance v1, Lg/l;

    iget-object v2, v0, Le/e0;->p:Le/s0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Le/s0;->R2()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, Le/e0;->l:Landroid/content/Context;

    :goto_0
    invoke-direct {v1, v2}, Lg/l;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Le/e0;->q:Lg/l;

    :cond_1
    iget-object v0, v0, Le/e0;->q:Lg/l;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    sget v0, Li/z3;->a:I

    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->b()V

    return-void
.end method

.method public final l()Le/r;
    .locals 2

    iget-object v0, p0, Le/m;->w:Le/e0;

    if-nez v0, :cond_0

    sget-object v0, Le/r;->b:Le/l0;

    new-instance v0, Le/e0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p0, p0}, Le/e0;-><init>(Landroid/content/Context;Landroid/view/Window;Le/n;Ljava/lang/Object;)V

    iput-object v0, p0, Le/m;->w:Le/e0;

    :cond_0
    iget-object v0, p0, Le/m;->w:Le/e0;

    return-object v0
.end method

.method public final m()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801ef

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801f2

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801f1

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0801f0

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/fragment/app/u;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object p1

    check-cast p1, Le/e0;

    iget-boolean v0, p1, Le/e0;->G:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Le/e0;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le/e0;->A()V

    iget-object v0, p1, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    iget-object v2, v0, Le/s0;->j:Landroid/content/Context;

    new-instance v3, Lg/a;

    invoke-direct {v3, v2, v1}, Lg/a;-><init>(Landroid/content/Context;I)V

    iget-object v2, v3, Lg/a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f040000

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    invoke-virtual {v0, v2}, Le/s0;->U2(Z)V

    :cond_0
    invoke-static {}, Li/x;->a()Li/x;

    move-result-object v0

    iget-object v2, p1, Le/e0;->l:Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v3, v0, Li/x;->a:Li/u2;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, v3, Li/u2;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln/e;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ln/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    new-instance v0, Landroid/content/res/Configuration;

    iget-object v2, p1, Le/e0;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p1, Le/e0;->S:Landroid/content/res/Configuration;

    invoke-virtual {p1, v1, v1}, Le/e0;->n(ZZ)Z

    return-void

    :goto_1
    :try_start_3
    monitor-exit v3

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/u;->onDestroy()V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->g()V

    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 5

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/u;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object p1

    check-cast p1, Le/e0;

    invoke-virtual {p1}, Le/e0;->A()V

    iget-object p1, p1, Le/e0;->p:Le/s0;

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v1, 0x102002c

    const/4 v2, 0x0

    if-ne p2, v1, :cond_8

    if-eqz p1, :cond_8

    iget-object p1, p1, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget p1, p1, Li/x3;->b:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_8

    invoke-static {p0}, Lr3/q;->i(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p0, p1}, Ly/l;->c(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p1, Ly/a0;

    invoke-direct {p1, p0}, Ly/a0;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lr3/q;->i(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {p0}, Lr3/q;->i(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    :cond_1
    iget-object v1, p1, Ly/a0;->b:Ljava/util/ArrayList;

    iget-object p1, p1, Ly/a0;->c:Landroid/content/Context;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v3

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    :try_start_0
    invoke-static {p1, v3}, Lr3/q;->j(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v1, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    invoke-static {p1, v3}, Lr3/q;->j(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :goto_1
    const-string p2, "TaskStackBuilder"

    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-array p2, v2, [Landroid/content/Intent;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/content/Intent;

    new-instance v1, Landroid/content/Intent;

    aget-object v3, p2, v2

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v1

    aput-object v1, p2, v2

    sget-object v1, Lz/d;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1, p2, v1}, Lz/a;->a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    :try_start_1
    sget p1, Ly/e;->b:I

    invoke-static {p0}, Ly/a;->a(Landroid/app/Activity;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p0, p1}, Ly/l;->b(Landroid/app/Activity;Landroid/content/Intent;)Z

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    return v0

    :cond_8
    return v2
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/u;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object p1

    check-cast p1, Le/e0;

    invoke-virtual {p1}, Le/e0;->w()V

    return-void
.end method

.method public final onPostResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/u;->onPostResume()V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    iget-object v0, v0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Le/s0;->C:Z

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/u;->onStart()V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Le/e0;->n(ZZ)Z

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/u;->onStop()V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    iget-object v0, v0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Le/s0;->C:Z

    iget-object v0, v0, Le/s0;->B:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Le/r;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/m;->m()V

    .line 2
    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/r;->j(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/m;->m()V

    .line 4
    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/r;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Le/m;->m()V

    .line 6
    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/r;->l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->setTheme(I)V

    invoke-virtual {p0}, Le/m;->l()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    iput p1, v0, Le/e0;->U:I

    return-void
.end method
