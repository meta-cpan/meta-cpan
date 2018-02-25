DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on \"List::MoreUtils\". Since it's \
only a backend, the API is not public and can change without any warning."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-XS-0.428.tar.gz"

SRC_URI[md5sum] = "79939a9c2deb83ea2fa7fcbd3ad9c5c9"
SRC_URI[sha256sum] = "9d9fe621429dfe7cf2eb1299c192699ddebf060953e5ebdc1b4e293c6d6dd62d"
RECOMMENDS += "config-autoconf-perl-native"
RECOMMENDS += "inc-latest-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/List-MoreUtils-XS-${PV}"

inherit cpan

do_configure() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
