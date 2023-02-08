DESCRIPTION = "File::Which finds the full or relative paths to executable programs on the \
system. This is normally the function of "which" utility. "which" is \
typically implemented as either a program or a built in shell command. On \
some platforms, such as Microsoft Windows it is not provided as part of the \
core operating system. This module provides a consistent API to this \
functionality regardless of the underlying platform."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Which"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-1.27.tar.gz"

SRC_URI[md5sum] = "d5c9154262b93398f0750ec364207639"
SRC_URI[sha256sum] = "3201f1a60e3f16484082e6045c896842261fc345de9fb2e620fd2a2c7af3a93a"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
