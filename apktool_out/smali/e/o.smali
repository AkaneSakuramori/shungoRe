.class public final synthetic Le/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le/o;->b:I

    iput-object p1, p0, Le/o;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Le/o;->b:I

    const/4 v1, 0x1

    iget-object v2, p0, Le/o;->c:Landroid/content/Context;

    packed-switch v0, :pswitch_data_0

    const-string v0, "Error downloading"

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_0
    new-instance v0, Lj/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lj/a;-><init>(I)V

    sget-object v1, Lw0/e;->a:Lf2/e;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lw0/e;->p(Landroid/content/Context;Lj/a;Lw0/d;Z)V

    return-void

    :pswitch_1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-wide/16 v7, 0x0

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    new-instance v1, Le/o;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Le/o;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v0, v3, :cond_5

    new-instance v0, Landroid/content/ComponentName;

    const-string v3, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    invoke-direct {v0, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v3

    if-eq v3, v1, :cond_5

    invoke-static {}, Le0/b;->a()Z

    move-result v3

    const-string v4, "locale"

    if-eqz v3, :cond_2

    sget-object v3, Le/r;->h:Ln/c;

    invoke-virtual {v3}, Ln/c;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/r;

    if-eqz v5, :cond_0

    check-cast v5, Le/e0;

    iget-object v5, v5, Le/e0;->l:Landroid/content/Context;

    if-eqz v5, :cond_0

    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    invoke-static {v3}, Le/q;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v3

    new-instance v5, Le0/h;

    new-instance v6, Le0/j;

    invoke-direct {v6, v3}, Le0/j;-><init>(Ljava/lang/Object;)V

    invoke-direct {v5, v6}, Le0/h;-><init>(Le0/j;)V

    goto :goto_1

    :cond_2
    sget-object v5, Le/r;->d:Le0/h;

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    sget-object v5, Le0/h;->b:Le0/h;

    :goto_1
    iget-object v3, v5, Le0/h;->a:Le0/i;

    check-cast v3, Le0/j;

    iget-object v3, v3, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v2}, Lr3/q;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v3}, Le/p;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v3

    invoke-static {v4, v3}, Le/q;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    :cond_4
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v0, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    :cond_5
    sput-boolean v1, Le/r;->g:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
