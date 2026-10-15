.class public final synthetic Lu2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/shungo/app/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/shungo/app/MainActivity;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lu2/o;->b:I

    iput-object p1, p0, Lu2/o;->c:Lcom/shungo/app/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lu2/o;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lu2/o;->c:Lcom/shungo/app/MainActivity;

    const-string v4, "this$0"

    packed-switch v0, :pswitch_data_0

    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "setLoading(false)"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void

    :pswitch_0
    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Logout cancelled"

    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_1
    sget v0, Lcom/shungo/app/MainActivity;->F:I

    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "typeof onLogout === \'function\' && onLogout()"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void

    :pswitch_2
    sget v0, Lcom/shungo/app/MainActivity;->F:I

    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f0f001e

    invoke-virtual {v3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/app"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :pswitch_3
    sget v0, Lcom/shungo/app/MainActivity;->F:I

    invoke-static {v3, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, v3, Lcom/shungo/app/MainActivity;->y:Lf1/a;

    if-eqz v0, :cond_1

    sget-object v2, Lj1/p0;->a:Ljava/lang/String;

    new-instance v2, Lj1/o0;

    invoke-direct {v2, v0}, Lj1/o0;-><init>(Lf1/a;)V

    const v0, 0x7f0f0034

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "getString(...)"

    invoke-static {v0, v4}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "ROOT"

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lj1/p0;->a:Ljava/lang/String;

    const-string v5, "Please provide the scheme in lowercase and make sure it\'s the same configured in the intent filter. Android expects the scheme to be lowercase."

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput-object v0, v2, Lj1/o0;->b:Ljava/lang/String;

    new-instance v0, Landroidx/fragment/app/k;

    const/4 v4, 0x1

    invoke-direct {v0, v4, v3}, Landroidx/fragment/app/k;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3, v0}, Lj1/o0;->a(Lcom/shungo/app/MainActivity;Landroidx/fragment/app/k;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    const-string v0, "account"

    invoke-static {v0}, Lc3/h;->E2(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const-string v2, "Shungo"

    const-string v4, "logout failed"

    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, "Something went wrong while logging out"

    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
