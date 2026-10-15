.class public final synthetic Landroidx/activity/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/activity/d;->b:I

    iput-object p2, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget v0, p0, Landroidx/activity/d;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Lcom/shungo/app/InjectorService;

    sget v1, Lcom/shungo/app/InjectorService;->o:I

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/shungo/app/InjectorService;->c:Landroid/webkit/WebView;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f0f001e

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/app/overlay"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Li2/k;

    iget-object v1, v0, Li2/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, Li2/k;->t(Z)V

    iput-boolean v1, v0, Li2/k;->m:Z

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Li2/d;

    invoke-virtual {v0, v4}, Li2/d;->t(Z)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Lr1/d;

    iput-boolean v3, v0, Lr1/d;->c:Z

    iget-object v1, v0, Lr1/d;->e:Lw/a;

    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lp0/e;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lp0/e;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v1, v0, Lr1/d;->b:I

    invoke-virtual {v0, v1}, Lr1/d;->a(I)V

    goto :goto_0

    :cond_1
    iget v3, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v3, v2, :cond_2

    iget v0, v0, Lr1/d;->b:I

    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_2
    :goto_0
    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Ly0/o0;->j0()V

    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/d0;

    sget-object v1, Landroidx/lifecycle/d0;->j:Landroidx/lifecycle/d0;

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Landroidx/lifecycle/d0;->c:I

    if-nez v1, :cond_3

    iput-boolean v4, v0, Landroidx/lifecycle/d0;->d:Z

    iget-object v1, v0, Landroidx/lifecycle/d0;->g:Landroidx/lifecycle/t;

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    :cond_3
    iget v1, v0, Landroidx/lifecycle/d0;->b:I

    if-nez v1, :cond_4

    iget-boolean v1, v0, Landroidx/lifecycle/d0;->d:Z

    if-eqz v1, :cond_4

    iget-object v1, v0, Landroidx/lifecycle/d0;->g:Landroidx/lifecycle/t;

    sget-object v2, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    iput-boolean v4, v0, Landroidx/lifecycle/d0;->e:Z

    :cond_4
    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :pswitch_8
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    sget v5, Ly/e;->b:I

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_e

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v5, v6, :cond_5

    sget-object v1, Ly/g;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_7

    :cond_5
    sget-object v6, Ly/g;->a:Ljava/lang/Class;

    const/16 v6, 0x1b

    const/16 v7, 0x1a

    if-eq v5, v7, :cond_7

    if-ne v5, v6, :cond_6

    goto :goto_1

    :cond_6
    move v8, v3

    goto :goto_2

    :cond_7
    :goto_1
    move v8, v4

    :goto_2
    sget-object v9, Ly/g;->f:Ljava/lang/reflect/Method;

    if-eqz v8, :cond_8

    if-nez v9, :cond_8

    goto/16 :goto_6

    :cond_8
    sget-object v8, Ly/g;->e:Ljava/lang/reflect/Method;

    if-nez v8, :cond_9

    sget-object v8, Ly/g;->d:Ljava/lang/reflect/Method;

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    :try_start_0
    sget-object v8, Ly/g;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    sget-object v10, Ly/g;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v10, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v11

    new-instance v12, Ly/f;

    invoke-direct {v12, v0}, Ly/f;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sget-object v13, Ly/g;->g:Landroid/os/Handler;

    :try_start_1
    new-instance v14, Li/j;

    invoke-direct {v14, v12, v8, v2}, Li/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v14, 0x3

    if-eq v5, v7, :cond_d

    if-ne v5, v6, :cond_c

    goto :goto_3

    :cond_c
    :try_start_2
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    goto :goto_4

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_d
    :goto_3
    const/16 v5, 0x9

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v8, v5, v3

    aput-object v1, v5, v4

    aput-object v1, v5, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v14

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x4

    aput-object v2, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v1, 0x7

    aput-object v2, v5, v1

    const/16 v1, 0x8

    aput-object v2, v5, v1

    invoke-virtual {v9, v10, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    :try_start_3
    new-instance v1, Li/j;

    invoke-direct {v1, v11, v12, v14}, Li/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_7

    :goto_5
    new-instance v2, Li/j;

    invoke-direct {v2, v11, v12, v14}, Li/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :goto_6
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    :cond_e
    :goto_7
    return-void

    :pswitch_9
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/p;

    invoke-static {v0}, Landroidx/activity/p;->a(Landroidx/activity/p;)V

    return-void

    :pswitch_a
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/m;

    iget-object v2, v0, Landroidx/activity/m;->c:Ljava/lang/Runnable;

    if-eqz v2, :cond_f

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    iput-object v1, v0, Landroidx/activity/m;->c:Ljava/lang/Runnable;

    :cond_f
    return-void

    :pswitch_b
    iget-object v0, p0, Landroidx/activity/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/n;

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
