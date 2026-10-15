.class public final Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;


# virtual methods
.method public final a()Ll/a;
    .locals 2

    new-instance v0, Ll/a;

    iget-object v1, p0, Ll/a;->a:Ljava/lang/Integer;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll/a;->a:Ljava/lang/Integer;

    iget-object v1, p0, Ll/a;->b:Ljava/lang/Integer;

    iput-object v1, v0, Ll/a;->b:Ljava/lang/Integer;

    iget-object v1, p0, Ll/a;->c:Ljava/lang/Integer;

    iput-object v1, v0, Ll/a;->c:Ljava/lang/Integer;

    iget-object v1, p0, Ll/a;->d:Ljava/lang/Integer;

    iput-object v1, v0, Ll/a;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Ll/a;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v2, "android.support.customtabs.extra.TOOLBAR_COLOR"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    iget-object v1, p0, Ll/a;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const-string v2, "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget-object v1, p0, Ll/a;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    const-string v2, "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-object v1, p0, Ll/a;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    const-string v2, "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    return-object v0
.end method
