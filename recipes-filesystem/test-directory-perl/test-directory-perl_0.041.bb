DESCRIPTION = "Testing code can involve making sure that files are created and deleted \
as expected. Doing this manually can be error prone, as it's easy to forget \
a file, or miss that some unexpected file was added. This module simplifies \
maintaining test directories by tracking their status as they are modified \
or tested with this API, making it simple to test both individual files, as \
well as to verify that there are no missing or unknown files."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Directory"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SA/SANBEG/Test-Directory-0.041.tar.gz"

SRC_URI[md5sum] = "03a0f475c4ab9258e58c8b3e29a7874a"
SRC_URI[sha256sum] = "194323490fa4b5951d93ee034e2da31669fb1959a39cc6fb6211fec810a098d9"

S = "${WORKDIR}/Test-Directory-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
