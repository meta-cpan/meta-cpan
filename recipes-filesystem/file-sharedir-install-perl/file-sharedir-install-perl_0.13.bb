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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-ShareDir-Install-0.13.tar.gz"

SRC_URI[md5sum] = "5eabd44a5d7d84bf2e8e502491226287"
SRC_URI[sha256sum] = "45befdf0d95cbefe7c25a1daf293d85f780d6d2576146546e6828aad26e580f9"

S = "${WORKDIR}/File-ShareDir-Install-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
