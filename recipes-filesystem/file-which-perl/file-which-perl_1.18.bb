DESCRIPTION = "File::Which finds the full or relative paths to executable programs on \
the system. This is normally the function of \"which\" utility. \"which\" \
is typically implemented as either a program or a built in shell command. \
On some platforms, such as Microsoft Windows it is not provided as part of \
the core operating system. This module provides a consistent API to this \
functionality regardless of the underlying platform."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Which"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-1.18.tar.gz"

SRC_URI[md5sum] = "554bfb36568d828fbeee64f4b9a9faa8"
SRC_URI[sha256sum] = "964918a867bef2ce8b63786e24e947b249d4c0626d2d98b7c9a2155328f1391c"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
