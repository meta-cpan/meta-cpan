DESCRIPTION = "File::ShareDir::Install allows you to install read-only data files from a \
distribution. It is a companion module to File::ShareDir, which allows you \
to locate these files after installation."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ShareDir-Install"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-ShareDir-Install-0.11.tar.gz"

SRC_URI[md5sum] = "61107e6ce6eee42bf29525b1a4d029e0"
SRC_URI[sha256sum] = "32bf8772e9fea60866074b27ff31ab5bc3f88972d61915e84cbbb98455e00cc8"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/File-ShareDir-Install-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
